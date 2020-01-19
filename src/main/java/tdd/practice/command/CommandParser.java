package tdd.practice.command;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommandParser {
    public List<String> parse(String input) {
        List<String> list = Arrays.asList(
                MoveCommand.NAME,
                TurnLeftCommand.NAME,
                TurnRightCommand.NAME,
                BackCommand.NAME
            );

        return Arrays.stream(input.split(" "))
                .filter(list::contains)
                .collect(Collectors.toList());
    }
}
