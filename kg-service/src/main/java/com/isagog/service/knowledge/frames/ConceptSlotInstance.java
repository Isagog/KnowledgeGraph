package com.isagog.service.knowledge.frames;

import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.KnowledgeAnnotation;

import javax.annotation.Nonnull;
import java.net.URI;
import java.util.*;
import java.util.function.Function;

public class ConceptSlotInstance extends MonadicSlotInstance {


    protected Set<URI> constraints = new HashSet<>();

    public ConceptSlotInstance(FrameInstance owner,ConceptualSlot slot) {
        super(owner,slot);
        if (slot.getConstraints() != null) {
            this.constraints.addAll(slot.getConstraints());
        }

    }

    public List<KnowledgeAnnotation> getAnnotations() {
        return slotType.getAnnotations();
    }


    public Optional<URI> getReference() {
        if (slotType.getReference() != null)
            return Optional.of(slotType.getReference());
        else
            return Optional.empty();
    }

    public boolean isRoot() {
        return slotType.isRoot();
    }



    public @Nonnull
    Set<URI> getConstraints() {
        return constraints;
    }

    public void setConstraints(Set<URI> constraints) {
        this.constraints = new HashSet<>(constraints);
    }


    public void addConstraint (URI uri) {
        constraints.add(uri);
    }

    public void addConstraints (Function<ConceptSlotInstance,Set<URI>> provider) {
        constraints.addAll(provider.apply(this));
    }

    public void addConstraints (Set<URI> constraints) {
        this.constraints.addAll(constraints);
    }

    @Override
    public boolean isVariable() {
        return !hasReference();
    }

    @Override
    public boolean isConstrained() {
        return !constraints.isEmpty();
    }

}
