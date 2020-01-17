package tdd.practice.car;

import tdd.practice.utils.Coordinate;
import tdd.practice.utils.Direction;

public class Car {
    private Coordinate coordinate;
    private Direction direction;

    public Car(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public String printLocation() {
        return coordinate.print() + " " + direction.print();
    }

    public void move() {
        if (direction.equals(Direction.SOUTH)) {
            coordinate.addY(-1);
        } else if (direction.equals(Direction.WEST)) {
            coordinate.addX(-1);
        } else if (direction.equals(Direction.EAST)) {
            coordinate.addX(1);
        } else {
            coordinate.addY(1);
        }
    }
}
