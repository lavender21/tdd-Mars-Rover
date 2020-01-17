package tdd.practice.utils;

public enum Direction {
    NORTH("N"),
    WEST("W"),
    SOUTH("S"),
    EAST("E");

    private String value;
    Direction(String value) {
        this.value = value;
    }

    public String print() {
        return value;
    }

    public Direction getLeft() {
        return Direction.values()[(ordinal() + 1) % 4];
    }
}
