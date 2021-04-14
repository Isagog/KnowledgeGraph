package com.isagog.service.interact;

import com.isagog.kg.model.InteractRecord;
import com.isagog.kg.model.InteractType;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Interactions {


    public static Optional<InteractRecord> getNextRecord(List<InteractRecord> interactions, int offrecord) {
        if (offrecord < interactions.size()-1) return Optional.of(interactions.get(offrecord+1));
        else return Optional.empty();
    }

    public static Optional<InteractRecord> getNextRecord(List<InteractRecord> interactions, int offrecord, InteractType itype) {
        return getFirstRecord(interactions.subList(offrecord,interactions.size()), itype);
    }

    public static Optional<InteractRecord> getFirstRecord(List<InteractRecord> interactions, InteractType itype) {
        return interactions.stream()
                .filter(i -> i.getItype().equals(itype))
                .findFirst();
    }

    public static List<InteractRecord> getSlotValuedRecords(List<InteractRecord> interactions) {
        return interactions.stream()
                .filter(i -> i.getSlotref() != null && i.getValue() != null)
                .collect(Collectors.toList());
    }
}
