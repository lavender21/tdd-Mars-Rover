package com.thoughtworks.command;

import com.thoughtworks.Rover;

public class ForwardCommand implements Command {
    private Rover rover;

    public ForwardCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.forward();
    }
}
