package tdd.practice.utils;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String print() {
        return "("+ x +"," + y + ")";
    }

    public void addY(int i) {
        y += i;
    }

    public void addX(int i) {
        x += i;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
