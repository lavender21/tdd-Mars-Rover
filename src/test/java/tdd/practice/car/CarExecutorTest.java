package tdd.practice.car;

import org.junit.jupiter.api.Test;
import tdd.practice.utils.Coordinate;
import tdd.practice.utils.Direction;

import static org.assertj.core.api.Assertions.assertThat;
/*
    1.car 1,1 N cmd M -> 1,2 N
    2.car 1,1 N cmd L -> 1,1 W
    3.car 1,1 N cmd R -> 1,1 E
    4.car 1,1 N cmd L M R  -> 0,1 N
    5.car 1,1 N cmd B M M R M -> 2,-1 W
 */

public class CarExecutorTest {
    @Test
    public void execute_car_when_send_cmd_L_M_R() {
        Car car = initCar(1,1, Direction.NORTH);

        CarExecutor.execute(car, "L M R");

        assertCarLocation(car, 0, 1, Direction.NORTH);
    }

    @Test
    public void execute_car_back_mode_when_cmd_include_back() {
        Car car = initCar(1,1, Direction.NORTH);

        CarExecutor.execute(car,"B M M R M");

        assertCarLocation(car, 2, -1, Direction.WEST);
    }

    private void assertCarLocation(Car car, int x, int y, Direction d) {
        assertThat(car.getCoordinate().getX()).isEqualTo(x);
        assertThat(car.getCoordinate().getY()).isEqualTo(y);
        assertThat(car.getDirection()).isEqualTo(d);
    }

    private Car initCar(int x, int y, Direction d) {
        Coordinate coordinate = new Coordinate(x, y);
        return new Car(coordinate, d);
    }
}
