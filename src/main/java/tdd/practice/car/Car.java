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
        int STEP = 1;
        if (direction.equals(Direction.SOUTH)) {
            coordinate.addY(-STEP);
        } else if (direction.equals(Direction.WEST)) {
            coordinate.addX(-STEP);
        } else if (direction.equals(Direction.EAST)) {
            coordinate.addX(STEP);
        } else {
            coordinate.addY(STEP);
        }
    }

    public void turnLeft() {
        if (direction.equals(Direction.SOUTH)) {
            direction = Direction.EAST;
        } else if(direction.equals(Direction.WEST)) {
            direction = Direction.SOUTH;
        } else if(direction.equals(Direction.EAST)) {
            direction = Direction.NORTH;
        } else {
            direction = Direction.WEST;
        }
    }
}
