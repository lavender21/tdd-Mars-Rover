
public class MarsRover {
    private Position position;

    public MarsRover(Position position) {
        this.position = position;
    }

    public String printPosition() {
        return position.toString();
    }
}
