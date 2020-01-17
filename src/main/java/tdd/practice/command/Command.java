package tdd.practice.command;

public enum Command {
    MOVE("M"),
    LEFT("L"),
    RIGHT("R");

    private String cmd;
    Command(String cmd) {
        this.cmd = cmd;
    }


    public static boolean contains(String input) {
        for(Command command : Command.values()) {
            if(input.equals(command.cmd)) return true;
        }
        return false;
    }

}
