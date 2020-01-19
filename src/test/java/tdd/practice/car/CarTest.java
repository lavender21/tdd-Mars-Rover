package tdd.practice.car;

import org.junit.jupiter.api.Test;
import tdd.practice.utils.Coordinate;
import tdd.practice.utils.Direction;

import static org.assertj.core.api.Assertions.*;

/*
    tasks
    1.car.printLocation()
      (1,1) "N" -> "(1,1) N"
    2.car.move()
    (1,1) "N" -> "(1,2) N"
    (1,1) "S" -> "(1,0) S"
    (1,1) "W" -> "(0,1) W"
    (1,1) "E" -> "(2,1) E"
    3.car.turnLeft()
    (1,1) "N" -> "(1,1) W"
    (1,1) "S" -> "(1,1) E"
    (1,1) "W" -> "(1,1) S"
    (1,1) "E" -> "(1,1) N"
    4.car.turnRight()
    (1,1) "N" -> "(1,1) E"
    (1,1) "S" -> "(1,1) W"
    (1,1) "W" -> "(1,1) N"
    (1,1) "E" -> "(1,1) S"
    5.car.toggleBackMode() car.move()
    6.car.toggleBackMode() car.turnLeft()
    7.car.toggleBackMode() car.turnRight()
 */

public class CarTest {
    private final String MOVE = "move";
    private final String TURN_LEFT = "left";
    private final String TURN_RIGHT = "right";

    @Test
    public void return_current_location_when_init_a_car() {
        Car car = initCar(1,1,Direction.NORTH);

        assertCarPosition(1, 1, Direction.NORTH, car);
    }

    @Test
    public void return_location_when_move_to_north() {

        testCarAction( MOVE,Direction.NORTH,1,2,Direction.NORTH);
    }

    @Test
    public void return_location_when_move_to_south() {
        testCarAction( MOVE,Direction.SOUTH,1,0,Direction.SOUTH);
    }

    @Test
    public void return_location_when_move_to_west() {
        testCarAction( MOVE,Direction.WEST,0,1,Direction.WEST);
    }

    @Test
    public void return_location_when_move_to_east() {
        testCarAction( MOVE,Direction.EAST,2,1,Direction.EAST);
    }

    @Test
    public void return_location_when_turn_left_from_north() {
        testCarAction(TURN_LEFT,Direction.NORTH,1,1,Direction.WEST);
    }

    @Test
    public void return_location_when_turn_left_from_south() {
        testCarAction(TURN_LEFT,Direction.SOUTH,1,1,Direction.EAST);
    }

    @Test
    public void return_location_when_turn_left_from_west() {
        testCarAction(TURN_LEFT,Direction.WEST,1,1,Direction.SOUTH);
    }

    @Test
    public void return_location_when_turn_left_from_east() {
        testCarAction(TURN_LEFT,Direction.EAST,1,1,Direction.NORTH);
    }

    @Test
    public void return_location_when_turn_right_from_north() {
        testCarAction(TURN_RIGHT, Direction.NORTH, 1,1,Direction.EAST);
    }

    @Test
    public void return_location_when_car_enable_back_mode_and_move() {
        Car car = initCar(1,1, Direction.NORTH);

        car.toggleBackMode();
        car.move();

        assertCarPosition(1,0, Direction.NORTH, car);
    }

    @Test
    public void return_location_when_car_enable_back_mode_and_turn_left() {
        Car car = initCar(1,1, Direction.NORTH);

        car.toggleBackMode();
        car.turnLeft();

        assertCarPosition(1,1, Direction.EAST, car);
    }

    @Test
    public void return_location_when_car_enable_back_mode_and_turn_right() {
        Car car = initCar(1,1, Direction.NORTH);

        car.toggleBackMode();
        car.turnRight();

        assertCarPosition(1,1, Direction.WEST, car);
    }

    private void testCarAction(String operation, Direction direction, int expectedX, int expectedY, Direction expectedDirection) {
        Car car = initCar(1,1,direction);
        if(operation.equals(MOVE)) {
            car.move();
        } else if(operation.equals(TURN_LEFT)) {
            car.turnLeft();
        } else if(operation.equals(TURN_RIGHT)) {
            car.turnRight();
        }

        assertCarPosition(expectedX, expectedY, expectedDirection, car);
    }

    private void assertCarPosition(int expectedX, int expectedY, Direction expectedDirection, Car car) {
        assertThat(car.getCoordinate().getX()).isEqualTo(expectedX);
        assertThat(car.getCoordinate().getY()).isEqualTo(expectedY);
        assertThat(car.getDirection()).isEqualTo(expectedDirection);
    }

    private Car initCar(int x, int y, Direction direction) {
        Coordinate coordinate = new Coordinate(x, y);
        return new Car(coordinate, direction);
    }
}
