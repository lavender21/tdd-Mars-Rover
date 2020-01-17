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

    public void move() {
        int STEP = 1;
        if (isEqualsDirection(Direction.SOUTH)) {
            coordinate.addY(-STEP);
        } else if (isEqualsDirection(Direction.WEST)) {
            coordinate.addX(-STEP);
        } else if (isEqualsDirection(Direction.EAST)) {
            coordinate.addX(STEP);
        } else {
            coordinate.addY(STEP);
        }
    }

    public void turnLeft() {
        direction = direction.getLeft();
    }

    private boolean isEqualsDirection(Direction d) {
        return direction.equals(d);
    }

    public void turnRight() {
        direction = direction.getRight();
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Direction getDirection() {
        return direction;
    }
}
