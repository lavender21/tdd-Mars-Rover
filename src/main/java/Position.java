import java.util.Map;
import java.util.stream.Collectors;

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

    public void turnLeft() {
        Integer key = Direction.directionMaps.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey)).get(direction);
        Integer directionKey =   key - 1 == 0 ? Direction.directionMaps.size() : key - 1;
        direction = Direction.directionMaps.get(directionKey);
    }

    public void turnRight() {
        Integer key = Direction.directionMaps.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey)).get(direction);
        Integer directionKey =   key + 1 == Direction.directionMaps.size() + 1 ? 1 : key + 1;
        direction = Direction.directionMaps.get(directionKey);
    }
}
