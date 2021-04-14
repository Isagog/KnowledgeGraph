package com.isagog.service.knowledge.frames;

//import com.isagog.kg.model ..ValueSlot;
import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.ValueType;

import java.net.URI;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

public class ValueSlotInstance extends MonadicSlotInstance {

    private ValueType type;

    private AttributeSlotInstance link;

    private String value;

    public ValueSlotInstance(FrameInstance owner,AttributeSlotInstance link, ValueType type, String value) {
     super(owner,new ConceptualSlot());   //TODO fix this
     this.link = link;
     this.type = type;
     this.value = value;
    }

    public ValueSlotInstance(FrameInstance owner,AttributeSlotInstance link, ValueType type) {
        this(owner,link,type,null);
    }

    public ValueSlotInstance(FrameInstance owner,AttributeSlotInstance link, String value) {
        this(owner,link,ValueType.STRING,value);
    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public Set<URI> getConstraints() {
        return Collections.emptySet();
    }


    @Override
    public String getId() {
        return value;
    }

    @Override
    public boolean isVariable() {
        return value == null;
    }


    @Override
    public Optional<URI> getReference() {
        return Optional.empty();
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean isConstrained() {
        return false;
    }


}
