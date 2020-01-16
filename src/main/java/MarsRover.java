
public class MarsRover {
    private Position position;

    public MarsRover(Position position) {
        this.position = position;
    }

    public String printPosition() {
        return position.toString();
    }

    public void sendOrder(String order) {
        if(order.equals("M")) {
            position.forward();
        }
        if(order.equals("L")) {
            position.turnLeft();
        }
        if(order.equals("R")) {
            position.turnRight();
        }
    }
}
