package com.alextroy.tourguidealextroy;

import java.util.HashMap;
import java.util.Map;

public enum AttractiveType {

    TAB_1(1),
    TAB_2(2),
    TAB_3(3),
    TAB_4(4);

    private static Map<Integer, AttractiveType> map = new HashMap<>();

    static {
        for (AttractiveType attrType : AttractiveType.values()) {
            map.put(attrType.value, attrType);
        }
    }

    private int value;

    AttractiveType(int value) {
        this.value = value;
    }

    public static AttractiveType valueOf(int value) {
        return map.get(value);
    }

    public int getValue() {
        return value;
    }
}
