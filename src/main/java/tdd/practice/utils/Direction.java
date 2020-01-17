package tdd.practice.utils;

public enum Direction {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private String value;
    Direction(String value) {
        this.value = value;
    }

    public String print() {
        return value;
    }
}
