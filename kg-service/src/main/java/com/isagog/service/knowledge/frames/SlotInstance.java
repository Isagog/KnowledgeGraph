package com.isagog.service.knowledge.frames;

import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.KnowledgeType;
import com.isagog.kg.model.Slot;

import java.net.URI;
import java.util.Optional;

public abstract class SlotInstance<S extends Slot> {

    protected S slotType;

    protected URI reference = null;

    protected FrameInstance owner;


    protected SlotInstance (FrameInstance owner, S slotType) {
        this.slotType = slotType;
        this.owner = owner;
        this.reference = slotType.getReference();
    }


    public FrameInstance getOwner() {
        return owner;
    }


    public String getId () {
        return slotType.getId();
    }


    public Optional<URI> getReference() {
        return Optional.ofNullable(reference);
    }

    public boolean hasReference () {
        return reference != null;
    }


    public boolean setReference (URI reference) {
        if (this.reference == null) {
            this.reference = reference;
            return true;
        }
        return false;
    }

    public KnowledgeType getSlotType()  {
        return KnowledgeType.valueOf(slotType.getKtype());
    }

    public boolean isRequired() {
        return slotType.isRequired();
    }

    public String getPath () {
        return String.format("%s.%s", owner.getFrameId(), getId());
    }
}
