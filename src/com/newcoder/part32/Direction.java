package com.newcoder.part32;

public enum Direction {

    EAST("冬"), SOUTH("南"), WEST("西"), NORTH("北");

    private final String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
