package org.example.model;

import java.security.SecureRandom;

public class RoomType {
    private String value;

    public static final String SINGLE = "Single";
    public static final String FAMILY = "Family";
    public static final String BUSINESS = "Business";

    private static final String[] VALUES = {SINGLE, FAMILY, BUSINESS};
    private static final SecureRandom RANDOM = new SecureRandom();

    public RoomType() {
        value = String.valueOf(getRandom());
    }

    public String getValue() {
        return value;
    }

    public static String getRandom() {
        return VALUES[RANDOM.nextInt(VALUES.length)];
    }
}
