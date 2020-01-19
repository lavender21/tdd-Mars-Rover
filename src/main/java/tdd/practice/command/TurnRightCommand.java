package tdd.practice.command;

import tdd.practice.car.Car;

public class TurnRightCommand implements Command {
    private Car car;
    public static final String NAME = "R";

    public TurnRightCommand(Car car) {
        this.car = car;
    }

    public void execute() {
        car.turnRight();
    }
}
