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
        return "(1,1) N";
    }
}
