package tdd.practice.command;

import tdd.practice.car.Car;

public class MoveCommand implements Command {
    private Car car;
    public static final String NAME = "M";

    public MoveCommand(Car car) {
        this.car = car;
    }

    public void execute() {
        car.move();
    }
}
