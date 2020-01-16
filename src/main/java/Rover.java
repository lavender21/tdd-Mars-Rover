public class Rover {
    private Coord coord;
    private String direction;

    public Rover(Coord coord, String direction) {
        this.coord = coord;
        this.direction = direction;
    }

    public String getCoord() {
        return "("+ coord.getX() +","+ coord.getY() +")";
    }

    public String getDirection() {
        return direction;
    }

    public String printLocation() {
        return getCoord() + " " + getDirection();
    }

    public void forward() {
        switch (direction) {
            case Direction.SOUTH:
                this.coord.minusY();
                break;
            case Direction.EAST:
                this.coord.addX();
                break;
            case Direction.WEST:
                this.coord.minusX();
                break;
            case Direction.NORTH:
                this.coord.addY();
                break;
            default:
                break;
        }
    }

    public void turnLeft() {
        Integer currentKey = Direction.invertMaps().get(direction);
        Integer nextKey = currentKey - 1 == 0 ? Direction.maps.size() : currentKey - 1;
        direction = Direction.maps.get(nextKey);
    }

    public void turnRight() {
        Integer currentKey = Direction.invertMaps().get(direction);
        Integer nextKey = currentKey % Direction.maps.size() + 1;
        direction = Direction.maps.get(nextKey);
    }
}
