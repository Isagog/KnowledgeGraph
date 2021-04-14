package com.isagog.service.knowledge.frames;

import com.isagog.kg.model.AttributiveSlot;

import javax.annotation.Nonnull;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

public class AttributeSlotInstance extends DyadicSlotInstance {

    private String value;

    public AttributeSlotInstance(FrameInstance owner,@Nonnull AttributiveSlot slotType) {

        super(owner,slotType);

        value = slotType.getValue();
    }


    @Override
    public String getSubjectBinding() {
        return ((AttributiveSlot) slotType).getSubjectBinding();
    }

    @Override
    public String getObjectBinding() {
        return ((AttributiveSlot) slotType).getValue();
    }

    @Override
    public Set<URI> getObjectConstraints() {
        return Collections.emptySet();
    }

    public Optional<String> getValue() {
        return Optional.ofNullable(value);
    }

    public boolean setValue (String value) {
        if (value == null) {
            this.value = value;
            return true;
        }
        return false;
    }

}
