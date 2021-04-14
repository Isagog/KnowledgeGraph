package com.isagog.service.knowledge.frames;

import com.isagog.kg.model.ConceptualSlot;
//import com.isagog.kg.model.ValueSlot;

import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

abstract public class MonadicSlotInstance extends SlotInstance<ConceptualSlot> {


    protected MonadicSlotInstance(FrameInstance owner, ConceptualSlot slotType) {
        super(owner,slotType);
    }

    public abstract Set<URI> getConstraints();

    public Optional<URI> findFirstConstraint () {
        return getConstraints().stream().findFirst();
    }


    public abstract boolean isVariable();


    // Tells if the slot must be instantiated in order for the frame to make sense
    public boolean isRequired() {
        return slotType.isRequired();
    }


    public boolean isClass() {
        return !slotType.isIndividual();
    }

    public boolean isInstance() {
        return hasReference() && !isClass();
    }



    public boolean isIndividual () {
        return slotType.isIndividual();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonadicSlotInstance that = (MonadicSlotInstance) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    public abstract boolean isConstrained();

    public Set<DyadicSlotInstance> getIncidentSlots() {
        return  owner.getIncident(this);
    }
}
