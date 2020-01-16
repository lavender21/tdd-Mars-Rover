
public class MarsRoverProcessor {
    private Rover rover;

    public MarsRoverProcessor(Rover rover) {
        this.rover = rover;
    }

    public void sendOrder(String order) {
        if(order.equals("M")) {
            rover.forward();
        }
        if(order.equals("L")) {
            rover.turnLeft();
        }
        if(order.equals("R")) {
            rover.turnRight();
        }
    }

    public String printLocation() {
        return rover.printLocation();
    }
}
