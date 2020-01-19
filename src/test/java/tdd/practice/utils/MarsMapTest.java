package tdd.practice.utils;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MarsMapTest {
    @Test
    public void return_empty_ditch_list_when_init_map() {
        MarsMap marsMap = new MarsMap();

        assertThat(marsMap.getDitches().size()).isEqualTo(0);
    }

    @Test
    public void mark_ditch_in_map() {
        MarsMap marsMap = new MarsMap();

        marsMap.markDitch(new Coordinate(2,2));

        assertThat(marsMap.getDitches().get(0).getX()).isEqualTo(2);
        assertThat(marsMap.getDitches().get(0).getY()).isEqualTo(2);
    }

    @Test
    public void return_true_when_coordinate_is_mark_as_ditches_in_map() {
        MarsMap marsMap = new MarsMap();

        marsMap.markDitch(new Coordinate(1,1));

        assertThat(marsMap.isDitches(new Coordinate(1,1))).isEqualTo(true);
    }
}
