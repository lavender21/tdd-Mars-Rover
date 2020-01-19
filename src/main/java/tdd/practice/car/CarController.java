package tdd.practice.car;

import tdd.practice.command.Command;
import tdd.practice.command.CommandParser;

import java.util.List;

public class CarController {
    public void execute(Car car, String cmd) {
        CommandParser commandParser = new CommandParser();
        List<String> cmdList = commandParser.parse(cmd);

        cmdList.forEach(cmdItem -> {
            if(cmdItem.equals(Command.MOVE)) {
                car.move();
            }
            if(cmdItem.equals(Command.LEFT)) {
                car.turnLeft();
            }
            if(cmdItem.equals(Command.RIGHT)) {
                car.turnRight();
            }
        });
    }
}
