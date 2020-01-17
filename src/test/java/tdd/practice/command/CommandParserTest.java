package tdd.practice.command;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/*
    指令解析器tasking
    1."M" -> ["M"]
    2."M L R" -> ["M", "L", "R"]
    3."M L A R" -> ["M","L", "R"]
 */
public class CommandParserTest {

    CommandParser commandParser = new CommandParser();
    @Test
    public void return_command_list_with_item_M_when_input_M() {
        List<String> commandList = Arrays.asList("M");
        assertThat(commandParser.parse("M")).isEqualTo(commandList);
    }

    @Test
    public void return_command_list_with_items_when_input_M_L_R() {
        List<String> commandList = Arrays.asList("M","L","R");
        assertThat(commandParser.parse("M L R")).isEqualTo(commandList);
    }

    @Test
    public void filter_invalid_command_when_input_command_not_support() {
        List<String> commandList = Arrays.asList("M","L","R");
        assertThat(commandParser.parse("M L A R")).isEqualTo(commandList);
    }
}
