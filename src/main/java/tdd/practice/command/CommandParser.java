package tdd.practice.command;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommandParser {
    public List<String> parse(String input) {
        return Arrays.stream(input.split(" "))
                .filter(Command::contains)
                .collect(Collectors.toList());
    }
}
