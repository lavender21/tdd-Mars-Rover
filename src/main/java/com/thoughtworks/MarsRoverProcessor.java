package com.thoughtworks;

import com.thoughtworks.command.Command;
import com.thoughtworks.command.ForwardCommand;
import com.thoughtworks.command.TurnLeftCommand;
import com.thoughtworks.command.TurnRightCommand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MarsRoverProcessor {
    private Rover rover;

    public MarsRoverProcessor(Rover rover) {
        this.rover = rover;
    }

    public void sendCommand(String command) {
        if (command.isEmpty()) return;

        ForwardCommand forwardCommand = new ForwardCommand(rover);
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(rover);
        TurnRightCommand turnRightCommand = new TurnRightCommand(rover);

        Map<String, Command> commandMap = new HashMap<String, Command>(){{
            put("M", forwardCommand);
            put("L", turnLeftCommand);
            put("R", turnRightCommand);
        }};

        String[] commands = command.split(" ");

        Arrays.stream(commands).forEach(signalCommand -> commandMap.get(signalCommand).execute());

    }

    public String printLocation() {
        return rover.printLocation();
    }
}
