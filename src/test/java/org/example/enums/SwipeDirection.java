package org.example.enums;

public enum SwipeDirection {
    LEFT(-1),
    RIGHT(1),
    UP(-1),
    DOWN(1);
    private final int value;

    SwipeDirection(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
