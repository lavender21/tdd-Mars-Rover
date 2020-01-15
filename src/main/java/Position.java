public class Position {
    private int x;
    private int y;
    private String direction;

    public Position(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String toString() {
        return "(" + x + "," + y + ") " + direction;
    }

    public void forward() {
        switch (direction) {
            case Direction.SOUTH:
                this.y--;
                break;
            case Direction.EAST:
                this.x++;
                break;
            case Direction.WEST:
                this.x--;
                break;
            case Direction.NORTH:
                this.y++;
                break;
            default:
                break;
        }
    }
}
