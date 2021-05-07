package com.isagog.service.knowledge.frames;

public class Slots {

    public static String getSlotIdFromPath(String path) {
        String[] cmp = path.split("\\.");
        return (cmp.length < 2) ? cmp[0] : cmp[1];
    }
}
