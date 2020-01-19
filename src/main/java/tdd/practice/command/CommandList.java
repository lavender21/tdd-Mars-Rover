package tdd.practice.command;

import java.util.Arrays;
import java.util.List;

public class CommandList {
    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final String BACK = "B";

    public static boolean contains(String input) {
        List<String> list = Arrays.asList(MOVE, LEFT, RIGHT, BACK);
        return list.stream().anyMatch(input::equals);
    }

}
