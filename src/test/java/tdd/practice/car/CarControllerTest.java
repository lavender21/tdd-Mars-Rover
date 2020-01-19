package tdd.practice.car;

import org.junit.jupiter.api.Test;
import tdd.practice.utils.Coordinate;
import tdd.practice.utils.Direction;

import static org.assertj.core.api.Assertions.assertThat;
/*
    1.car 1,1 N cmd M -> 1,2 N
    2.car 1,1 N cmd L -> 1,1 W
    3.car 1,1 N cmd R -> 1,1 E
    4.car 1,1 N cmd L M R -> mock .. -> 0,1 N
 */

public class CarControllerTest {
    @Test
    public void print_car_location_when_send_cmd_move() {
        Coordinate coordinate = new Coordinate(1,1);
        Car car = new Car(coordinate, Direction.NORTH);

        CarController carController = new CarController();
        carController.execute(car, "L M R");
        assertThat(car.getCoordinate().getX()).isEqualTo(0);
        assertThat(car.getCoordinate().getY()).isEqualTo(1);
        assertThat(car.getDirection()).isEqualTo(Direction.NORTH);
    }
}
