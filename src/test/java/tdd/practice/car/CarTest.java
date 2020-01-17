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
 */

public class CarTest {

    @Test
    public void return_current_location_when_init_a_car() {
        Coordinate coordinate = new Coordinate(1,1);
        Car car = new Car(coordinate, Direction.NORTH);

        assertThat(car.printLocation()).isEqualTo("(1,1) N");
    }

    @Test
    public void return_location_when_move_to_north() {
        testMoveAction(Direction.NORTH, "(1,2) N");
    }

    @Test
    public void return_location_when_move_to_south() {
        testMoveAction(Direction.SOUTH, "(1,0) S");
    }

    @Test
    public void return_location_when_move_to_west() {
        testMoveAction(Direction.WEST, "(0,1) W");
    }

    @Test
    public void return_location_when_move_to_east() {
        testMoveAction(Direction.EAST, "(2,1) E");
    }

    @Test
    public void return_location_when_turn_left_from_north() {
        testTurnLeftAction(Direction.NORTH, "(1,1) W");
    }

    @Test
    public void return_location_when_turn_left_from_south() {
        testTurnLeftAction(Direction.SOUTH, "(1,1) E");
    }

    @Test
    public void return_location_when_turn_left_from_west() {
        testTurnLeftAction(Direction.WEST, "(1,1) S");
    }

    @Test
    public void return_location_when_turn_left_from_east() {
        testTurnLeftAction(Direction.EAST, "(1,1) N");
    }

    private void testMoveAction(Direction direction, String expected) {
        Coordinate coordinate = new Coordinate(1,1);
        Car car = new Car(coordinate, direction);
        car.move();

        assertThat(car.printLocation()).isEqualTo(expected);
    }

    private void testTurnLeftAction(Direction direction, String expected) {
        Coordinate coordinate = new Coordinate(1,1);
        Car car = new Car(coordinate, direction);
        car.turnLeft();

        assertThat(car.printLocation()).isEqualTo(expected);
    }
}
