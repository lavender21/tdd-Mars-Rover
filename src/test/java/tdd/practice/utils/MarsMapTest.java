package tdd.practice.utils;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MarsMapTest {
    @Test
    public void return_empty_ditch_list_when_init_map() {
        MarsMap marsMap = new MarsMap();

        assertThat(marsMap.getDitches().size()).isEqualTo(0);
    }
}
