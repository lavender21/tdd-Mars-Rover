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
        assertLocation(Direction.NORTH, "(1,1) N");
    }


    private void assertLocation(Direction direction, String expected) {
        Coordinate coordinate = new Coordinate(1,1);
        Car car = new Car(coordinate, direction);

        assertThat(car.printLocation()).isEqualTo(expected);
    }
}
