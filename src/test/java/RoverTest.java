import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RoverTest {
    @Test
    public void get_rover_position_info() {
        Coord coord = new Coord(1,1);
        Rover rover = new Rover(coord, "N");

        assertThat(rover.getCoord()).isEqualTo("(1,1)");
    }

    @Test
    public void get_rover_direction_info() {
        Coord coord = new Coord(1,1);
        Rover rover = new Rover(coord, "N");

        assertThat(rover.getDirection()).isEqualTo("N");
    }

    @Test
    public void print_rover_location() {
        Coord coord = new Coord(1,1);
        Rover rover = new Rover(coord, "N");

        assertThat(rover.printLocation()).isEqualTo("(1,1) N");
    }

}
