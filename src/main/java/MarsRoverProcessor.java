
public class MarsRoverProcessor {
    private Rover rover;

    public MarsRoverProcessor(Rover rover) {
        this.rover = rover;
    }

    public void sendCommand(String command) {
        ForwardCommand forwardCommand = new ForwardCommand(rover);
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(rover);

        if(command.equals("M")) {
            forwardCommand.execute();
        }
        if(command.equals("L")) {
            turnLeftCommand.execute();
        }
        if(command.equals("R")) {
            rover.turnRight();
        }
    }

    public String printLocation() {
        return rover.printLocation();
    }
}
