package com.isagog.service.knowledge.frames;

import com.isagog.kg.model.*;
import com.isagog.service.ServiceException;
import com.isagog.service.interact.Interactions;
import com.isagog.service.knowledge.KnowledgeFactory;
import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.TopologicalOrderIterator;

import javax.annotation.Nonnull;
import java.net.URI;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FrameInstance {

    private final Frame frameType;

    private int framehash = 0;

    private DirectedAcyclicGraph<MonadicSlotInstance, DyadicSlotInstance> instanceGraph;


    public String getFrameId() {
        return frameType.getId();
    }

    public Frame getFrameType() {
        return frameType;
    }



    public Optional<Frame> lift() {
        try {
            Frame lifted = KnowledgeFactory.newFrame(frameType.getId());

            lifted.setConceptualSlots(getConceptVertices().stream()
                    .map(cv -> liftSlot(cv).orElseThrow(ServiceException.raise("Can't lift conceptual slot")))
                    .collect(Collectors.toList()));

            lifted.setRelationalSlots(getRelationalLinks().stream()
                    .map(re -> liftSlot(re).orElseThrow(ServiceException.raise("Can't lift relational slot")))
                    .collect(Collectors.toList()));

            lifted.setAttributiveSlots(getAttributiveLinks().stream()
                    .map(re -> liftSlot(re).orElseThrow(ServiceException.raise("Can't lift attributive slot")))
                    .collect(Collectors.toList()));

            return Optional.of(lifted);
        } catch (ServiceException e) {
            return Optional.empty();
        }

    }

    private Optional<AttributiveSlot> liftSlot (AttributeSlotInstance csi) {

        AttributiveSlot rt = null;
        try {
            rt = KnowledgeFactory.newAttributiveSlot(csi.getId());

            rt.setReference(csi.reference);
            rt.setRequired(csi.isRequired());
            rt.setSubjectBinding(csi.getSubjectBinding());
            rt.setSubjectConstraints(new ArrayList<>(csi.getSubjectConstraints()));

        } catch (ServiceException e) {
            return Optional.empty();
        }

        return Optional.of(rt);
    }

    private Optional<RelationalSlot> liftSlot (RelationSlotInstance csi) {

        RelationalSlot rt = null;
        try {
            rt = KnowledgeFactory.newRelationalSlot(csi.getId());

            rt.setReference(csi.reference);
            rt.setRequired(csi.isRequired());
            rt.setObjectBinding(csi.getObjectBinding());
            rt.setSubjectBinding(csi.getSubjectBinding());
            rt.setObjectConstraints(new ArrayList<>(csi.getObjectConstraints()));
            rt.setSubjectConstraints(new ArrayList<>(csi.getSubjectConstraints()));


        } catch (ServiceException e) {
            return Optional.empty();
        }

        return Optional.of(rt);
    }

    private Optional<com.isagog.kg.model.ConceptualSlot> liftSlot (ConceptSlotInstance csi) {

        com.isagog.kg.model.ConceptualSlot rt = null;
        try {
            rt =  KnowledgeFactory.newConceptualSlot(csi.getId());
            rt.setReference(csi.reference);
            rt.setConstraints(new ArrayList<>(csi.constraints));
            rt.setIndividual(csi.isIndividual());
            rt.setRequired(csi.isRequired());
            rt.setRoot(csi.isRoot());

        } catch (ServiceException e) {
            return Optional.empty();
        }

        return Optional.of(rt);

    }



    public  Optional<MonadicSlotInstance> getMonadicSlotInstance(String slotPath) {
        String slotId = Slots.getSlotIdFromPath(slotPath);
        return getVertex(slotId);
    }

    public  Optional<DyadicSlotInstance> getDyadicSlotInstance(String slotPath) {
        String slotId = Slots.getSlotIdFromPath(slotPath);
        return getEdge(slotId);
    }

    public Optional<SlotInstance<?>> getSlotInstance (String slotPath) {
        String slotId = Slots.getSlotIdFromPath(slotPath);
        return getSlotInstances().stream()
                                 .filter(si -> si.getId().equals(slotId))
                                 .findAny();
    }



    public Set<URI> getRelationalSlotSubjectConstraints(RelationSlotInstance relationalSlot) {
        return getMonadicSlotInstance(relationalSlot.getSubjectBinding())
                 .orElseThrow(ServiceException.raise("Can't find monadic slot instance"))
                 .getConstraints();

    }

    public MonadicSlotInstance getIncident(DyadicSlotInstance dyadicSlotInstance) {
       return instanceGraph.getEdgeSource(dyadicSlotInstance);
    }

    public Set<DyadicSlotInstance> getIncident(MonadicSlotInstance monadicSlotInstance) {
        return instanceGraph.incomingEdgesOf(monadicSlotInstance);
    }

    public MonadicSlotInstance getTarget(DyadicSlotInstance dyadicSlotInstance) {
        return instanceGraph.getEdgeTarget(dyadicSlotInstance);
    }

    static class Iterator extends TopologicalOrderIterator<MonadicSlotInstance, DyadicSlotInstance> {
        public Iterator(Graph<MonadicSlotInstance, DyadicSlotInstance> graph) {
            super(graph);
        }

    }


    FrameInstance(Frame frame) {
        this.frameType = frame;
        build();
    }


    public FrameInstance instantiate(List<InteractRecord> interactions) throws ServiceException {
        for (InteractRecord record : Interactions.getSlotValuedRecords(interactions)) {
                SlotInstance<?> slot = getSlotInstance(record.getSlotref()).orElseThrow(ServiceException.raise("Can't get slot instalce"));
                switch (slot.getSlotType()) {
                    case CONCEPTUALSLOT: {
                        ConceptSlotInstance conceptualSlot = (ConceptSlotInstance) slot;
                        switch (record.getItype()) {
                            case ENTITY:
                                conceptualSlot.setReference(URI.create(record.getKitem()));
                                if (record.getConstraints() != null) {
                                    record.getConstraints()
                                            .forEach(cont -> conceptualSlot.addConstraint(URI.create(cont)));
                                }
                                break;
                            case CONCEPT:
                                conceptualSlot.addConstraint(URI.create(record.getKitem()));
                                break;
                            default:
                                //SKIP
                        }
                    }
                    break;
                    case RELATIONALSLOT: {
                        RelationSlotInstance relationalSlot = (RelationSlotInstance) slot;
                        switch (record.getItype()) {
                            case RELATION:
                                URI relRef = URI.create(record.getKitem());
                                relationalSlot.setReference(relRef);
                                /* this will be deleted */
                                List<URI> relConstraints = record.getConstraints()
                                                                 .stream()
                                                                 .map(URI::create)
                                                                 .collect(Collectors.toList());
                                
                                    switch(relConstraints.size()) {
                                        case 2: {
                                            relationalSlot.addSubjectConstraint(relConstraints.get(0));
                                            relationalSlot.addObjectConstraint(relConstraints.get(1));
                                        } break;
                                        case 1: {
                                            relationalSlot.addSubjectConstraint(relConstraints.get(0));
                                        } break;
                                    }
                                 /* --- */


                                
                                break;
                            default:
                                //SKIP
                        }
                    }
                    break;
                    case ATTRIBUTIVESLOT: {
                        AttributeSlotInstance attributiveSlot = (AttributeSlotInstance) slot;
                        switch (record.getItype()) {
                            case VALUE:
                                attributiveSlot.setValue(record.getValue());
                                break;
                            case ATTRIBUTE:
                                attributiveSlot.setReference(URI.create(record.getKitem()));
                                List<String> attConstraints = record.getConstraints();
                                if (attConstraints != null && attConstraints.size() > 0) {
                                    attributiveSlot.addSubjectConstraint(URI.create(attConstraints.get(0)));
                                }
                                break;
                            default:
                        }

                    }
                    break;
                }

        };
        return this;
    }


    private void build() {
        if (shash(frameType) != framehash) {
   
                instanceGraph = new DirectedAcyclicGraph<>(DyadicSlotInstance.class);
                List<ConceptualSlot> cslots = frameType.getConceptualSlots();
                if (cslots != null) {
                    cslots.forEach(this::addConceptVertex);
                }

                List<RelationalSlot> rslots = frameType.getRelationalSlots();
                if (rslots != null)
                    rslots.forEach(this::addRelationLink);

                List<AttributiveSlot> aslots = frameType.getAttributiveSlots();
                if (aslots != null)
                    aslots.forEach(this::addAttributeLink);

                framehash = frameType.hashCode();

        }

    }


    // slot id hash, ensures that no slots have been added or removed
    private int shash(Frame frame) {
        int fhash = 31;
        for (ConceptualSlot cs : frame.getConceptualSlots()) {
            fhash += 3 * cs.getId().hashCode();
        }
        for (RelationalSlot rs : frame.getRelationalSlots()) {
            fhash += 5 * rs.getId().hashCode();
        }
        for (AttributiveSlot as : frame.getAttributiveSlots()) {
            fhash += 7 * as.getId().hashCode();
        }
        return fhash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrameInstance that = (FrameInstance) o;
        return framehash == that.framehash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(framehash);
    }

    /**
     * Gets a topological iterator
     * @return
     */
    public Iterator getIterator () {
        // // refresh();
        return new Iterator(instanceGraph);
    }


    private Optional<ValueSlotInstance> addValueVariable (@Nonnull AttributeSlotInstance link, @Nonnull ValueType type) {
        ValueSlotInstance v = new ValueSlotInstance(this,link,type);
        if (instanceGraph.addVertex (v)) {
            return Optional.of(v);
        } else {
            return Optional.empty();
        }
    }



    private Optional<ConceptSlotInstance> addConceptVertex(@Nonnull ConceptualSlot conceptualSlot) {
        ConceptSlotInstance v = new ConceptSlotInstance(this,conceptualSlot);
        if (instanceGraph.addVertex(v)) {
            return Optional.of(v);
        } else {
            return Optional.empty();
        }
    }
    private Optional<RelationSlotInstance> addRelationLink (@Nonnull RelationalSlot slot) {//(ConceptVariable v1, ConceptVariable v2, String label) {

        MonadicSlotInstance v1 = getConceptVertex(slot.getSubjectBinding())
                                                .orElseThrow(ServiceException.raise("Subject not found"));

        MonadicSlotInstance v2 = getVertex(slot.getObjectBinding())
                .orElseThrow(ServiceException.raise("Object not found"));

        RelationSlotInstance rl = new RelationSlotInstance(this,slot);

        if (instanceGraph.addEdge(v1,v2,rl)) {
            return Optional.of(rl);
        } else {
            return Optional.empty();
        }
    }


    private Optional<AttributeSlotInstance> addAttributeLink (@Nonnull AttributiveSlot slot) {

        MonadicSlotInstance v1 = getConceptVertex(slot.getSubjectBinding())
                .orElseThrow(ServiceException.raise("Subject not found"));

        ValueSlotInstance v2 = getValueVertex(slot.getValue())
                .orElseThrow(ServiceException.raise("Object not found"));

        AttributeSlotInstance rl = new AttributeSlotInstance(this,slot);

        if (instanceGraph.addEdge(v1,v2,rl)) {
            return Optional.of(rl);
        } else {
            return Optional.empty();
        }
    }

    public Optional<ValueSlotInstance> getValueVertex(@Nonnull String value) {
        return getValueVertices().stream()
                .filter(v -> v.getId().equals(value))
                .findFirst();
    }

    public Set<ValueSlotInstance> getValueVertices() {
        return instanceGraph.vertexSet().stream()
                .filter(v -> v instanceof ValueSlotInstance)
                .map(v -> (ValueSlotInstance) v)
                .collect(Collectors.toSet());
    }

    public Set<ConceptSlotInstance> getConceptVertices() {
        return instanceGraph.vertexSet().stream()
                .filter(v -> v instanceof ConceptSlotInstance)
                .map(v -> (ConceptSlotInstance) v)
                .collect(Collectors.toSet());
    }


    public Set<SlotInstance<?>> getSlotInstances () {
        Set<SlotInstance<?>> rt = new HashSet<>();
        rt.addAll(instanceGraph.vertexSet());
        rt.addAll(instanceGraph.edgeSet());
        return rt;
    }



    public Set<ConceptSlotInstance> getConceptVertices(Predicate<ConceptSlotInstance> filter) {
         return instanceGraph.vertexSet().stream()
                .filter(v -> v instanceof ConceptSlotInstance && filter.test((ConceptSlotInstance) v))
                .map(v -> (ConceptSlotInstance) v)
                .collect(Collectors.toSet());
    }

    public Optional<ConceptSlotInstance> getConceptVertex(@Nonnull String id) {
        return getConceptVertices().stream()
                .filter(v -> v.getId().equals(id))
                .findFirst();
    }


    private Optional<DyadicSlotInstance> getEdge (@Nonnull String id) {
        return instanceGraph.edgeSet()
                            .stream()
                            .filter(e -> e.getId().equals(id))
                            .findFirst();
    }

    public Optional<MonadicSlotInstance> getVertex(@Nonnull String slotPath) {
        String id = Slots.getSlotIdFromPath(slotPath);
        return instanceGraph.vertexSet()
                .stream()
                .filter(v -> v.getId().equals(id))
                .findFirst();
        // refresh();

    }


    public Set<MonadicSlotInstance> getVariables() {
        // refresh();
        return instanceGraph.vertexSet().stream()
                .filter(MonadicSlotInstance::isVariable)
                .collect(Collectors.toSet());
    }

    public Set<MonadicSlotInstance> getVariables(Predicate<MonadicSlotInstance> predicate) {
        // refresh();
        return instanceGraph.vertexSet().stream()
                .filter(v -> v.isVariable() && predicate.test(v))
                .collect(Collectors.toSet());
    }

    public Set<RelationSlotInstance> getRelationalLinks() {
        // refresh();
        return instanceGraph.edgeSet().stream()
                     .filter(e -> e instanceof RelationSlotInstance)
                     .map (e -> (RelationSlotInstance) e)
                     .collect(Collectors.toSet());
    }

    public Set<AttributeSlotInstance> getAttributiveLinks() {
        // refresh();
        return instanceGraph.edgeSet().stream()
                .filter(e -> e instanceof AttributeSlotInstance)
                .map (e -> (AttributeSlotInstance) e)
                .collect(Collectors.toSet());
    }

    public List<RelationSlotInstance> getRelationalLinksBySubject(String slotPath) {
        String slotId = Slots.getSlotIdFromPath(slotPath);
        return instanceGraph.edgeSet().stream()
                     .filter(e -> e.getSubjectBinding().equals(slotId))
                     .filter(e -> e instanceof RelationSlotInstance)
                     .map (e -> (RelationSlotInstance) e)
                     .collect(Collectors.toList());

    }

    public List<RelationSlotInstance> getRelationalLinksByObject(String slotPath) {
        String slotId = Slots.getSlotIdFromPath(slotPath);
        return instanceGraph.edgeSet().stream()
                .filter(e -> e.getObjectBinding().equals(slotId))
                .filter(e -> e instanceof RelationSlotInstance)
                .map (e -> (RelationSlotInstance) e)
                .collect(Collectors.toList());

    }

    public List<MonadicSlotInstance> getRootVertices() {
        // refresh();
        return instanceGraph.vertexSet().stream()
              .filter(v -> instanceGraph.incomingEdgesOf(v).isEmpty())
              .collect(Collectors.toList());
    }

    /*
    public Optional<SlotReference<?>> getNextRequiredSlot() {
        // refresh();
        Iterator ite = new Iterator(instanceGraph);
        SlotInstance<?> retrieved = null;
        while (ite.hasNext() && retrieved == null) {
            MonadicSlotInstance nx = ite.next();
            if (isRequired(nx)) {
                retrieved = nx;
            } else {
                for (DyadicSlotInstance edg : instanceGraph.outgoingEdgesOf(nx)) {
                    if (isRequired(edg)) {
                        retrieved = edg;
                    }
                }
            }
        }
        if (retrieved != null)
             return Optional.of(SlotReference.toReference(frameType.getId(),retrieved));
        else return Optional.empty();

    }

     */

    public Optional<SlotInstance<?>> getNextRequiredSlot() {
        // refresh();
        Iterator ite = new Iterator(instanceGraph);
        SlotInstance<?> retrieved = null;
        while (ite.hasNext() && retrieved == null) {
            MonadicSlotInstance nx = ite.next();
            if (isRequired(nx)) {
                retrieved = nx;
            } else {
                for (DyadicSlotInstance edg : instanceGraph.outgoingEdgesOf(nx)) {
                    if (isRequired(edg)) {
                        retrieved = edg;
                    }
                }
            }
        }
        return Optional.ofNullable(retrieved);
    }

    private static boolean isRequired(SlotInstance<?> slot) {
        switch (slot.getSlotType()) {
            case CONCEPTUALSLOT: {
                ConceptSlotInstance cs = (ConceptSlotInstance) slot;
                if (cs.isIndividual()) {
                    return !cs.getReference().isPresent();
                } else {
                    return cs.getConstraints().isEmpty();
                }
            }
            case RELATIONALSLOT: {
                RelationSlotInstance rs = (RelationSlotInstance) slot;
                return  (!rs.getReference().isPresent()) || rs.getObjectBinding() == null;
                //return ;
            }
            case ATTRIBUTIVESLOT: {
                AttributeSlotInstance as = (AttributeSlotInstance) slot;
                return  (!as.getReference().isPresent()) || (!as.getValue().isPresent());
            }
            //           case "ValueSlot": return ((ValueSlot) s).getValue() == null;
            default: return false;
        }

    }

}
