package tdd.practice.command;

import tdd.practice.car.Car;

public class TurnLeftCommand implements Command {
    private Car car;
    public TurnLeftCommand(Car car) {
        this.car = car;
    }

    public void execute() {
        car.turnLeft();
    }
}
