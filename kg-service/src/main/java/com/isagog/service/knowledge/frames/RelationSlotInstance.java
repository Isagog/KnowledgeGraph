package com.isagog.service.knowledge.frames;

import com.isagog.kg.model.RelationalSlot;

import javax.annotation.Nonnull;
import java.net.URI;
import java.util.*;
import java.util.function.Function;

public class RelationSlotInstance extends DyadicSlotInstance {


    private  Set<URI> objectConstraints = new HashSet<>();


    public RelationSlotInstance(FrameInstance owner,@Nonnull RelationalSlot slotType) {
        super(owner,slotType);
        if (slotType.getSubjectConstraints() != null)
            subjectConstraints.addAll(slotType.getSubjectConstraints());
        if (slotType.getObjectConstraints() != null)
            objectConstraints.addAll(slotType.getObjectConstraints());
        reference = slotType.getReference();
    }

    public void addObjectConstraint (URI uri) {
        objectConstraints.add(uri);
    }

    public void addObjectConstraints (Function<RelationSlotInstance,Set<URI>> provider) {
        objectConstraints.addAll(provider.apply(this));
    }

    public void addObjectConstraints (Set<URI> constraints) {
        objectConstraints.addAll(constraints);
    }

    public Set<URI> getObjectConstraints() {
        return objectConstraints;
    }

    @Override
    public String getSubjectBinding() {
        return ((RelationalSlot) slotType).getSubjectBinding();
    }

    @Override
    public String getObjectBinding() {
        return ((RelationalSlot) slotType).getObjectBinding();
    }

    public ConceptSlotInstance getTargetSlot() {
        return (ConceptSlotInstance) owner.getTarget(this);
    }

    public void setObjectConstraints(Set<URI> objectConstraints) {
        this.objectConstraints = new HashSet<>(objectConstraints);
    }
}
