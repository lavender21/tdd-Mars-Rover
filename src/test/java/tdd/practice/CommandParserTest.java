package tdd.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/*
    指令解析器tasking
    1."M" -> ["M"]
    2."L" -> ["L"]
    3."R" -> ["R"]
    4."M L A R" -> ["M","L", "R"]
    5."sdfsf" -> Error: invalid command
 */
public class CommandParserTest {

    @Test
    public void return_command_list_with_item_M_when_input_M() {
        CommandParser commandParser = new CommandParser();

        List<String> commandList = Arrays.asList("M");
        assertThat(commandParser.parse("M")).isEqualTo(commandList);
    }
}
