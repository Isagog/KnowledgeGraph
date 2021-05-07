package com.isagog.service.knowledge.frames;

import com.isagog.kg.model.AttributiveSlot;
import com.isagog.kg.model.KnowledgeType;
import com.isagog.kg.model.RelationalSlot;
import com.isagog.kg.model.Slot;

import java.net.URI;
import java.util.*;
import java.util.function.Function;

abstract public class DyadicSlotInstance extends SlotInstance<Slot> {

    protected Set<URI> subjectConstraints = new HashSet<>();

    protected DyadicSlotInstance(FrameInstance owner,RelationalSlot slotType) {
        super(owner,slotType);
    }

    protected DyadicSlotInstance(FrameInstance owner, AttributiveSlot slotType) {
        super(owner,slotType);
    }




    public void addSubjectConstraint (URI uri) {
        subjectConstraints.add(uri);
    }

    public void addSubjectConstraints (Function<DyadicSlotInstance,Set<URI>> provider) {
        subjectConstraints.addAll(provider.apply(this));
    }

    public void addSubjectConstraints (Set<URI> constraints) {
        subjectConstraints.addAll(constraints);
    }

    public boolean isRelational () {
        return getSlotType().equals(KnowledgeType.RELATIONALSLOT);
    }

    public boolean isAttributive () {
        return getSlotType().equals(KnowledgeType.ATTRIBUTIVESLOT);
    }

    public Set<URI> getSubjectConstraints () {
        return subjectConstraints;
    }

    public abstract String getSubjectBinding();

    public abstract String getObjectBinding();

    public ConceptSlotInstance getIncidentSlot() {
        return (ConceptSlotInstance) owner.getIncident(this);
    }

    public abstract Set<URI> getObjectConstraints();

    public void setSubjectConstraints(Set<URI> subjectConstraints) {
        this.subjectConstraints = new HashSet<>(subjectConstraints);
    }


}
