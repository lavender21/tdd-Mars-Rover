package tdd.practice.car;

import tdd.practice.command.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarExecutor {
    private Car car;
    public CarExecutor(Car car) {
        this.car = car;
    }

    public void execute(String cmd) {
        CommandParser commandParser = new CommandParser();
        List<String> cmdList = commandParser.parse(cmd);

        Command moveCommand = new MoveCommand(car);
        Command turnLeftCommand = new TurnLeftCommand(car);
        Command turnRightCommand = new TurnRightCommand(car);

        Map<String, Command> commandMap = new HashMap<String, Command>(){{
            put(MoveCommand.NAME, moveCommand);
            put(TurnLeftCommand.NAME, turnLeftCommand);
            put(TurnRightCommand.NAME, turnRightCommand);
        }};

        cmdList.forEach(cmdItem -> {
            commandMap.get(cmdItem).execute();
        });
    }
}
