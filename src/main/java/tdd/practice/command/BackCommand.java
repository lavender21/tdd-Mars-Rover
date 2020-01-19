package tdd.practice.command;

import tdd.practice.car.Car;

public class BackCommand implements Command {
    private Car car;
    public static final String NAME = "B";

    public BackCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.toggleBackMode();
    }
}
