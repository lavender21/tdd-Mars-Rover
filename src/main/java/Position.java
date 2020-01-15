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
        if (direction == "S") {
            this.y--;
        } else if(direction == "E"){
            this.x++;
        } else {
            this.y++;
        }
    }
}
