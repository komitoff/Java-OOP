package harversting_fields;

import java.util.Scanner;

public class Main {
    private static final String TERMINATE_COMMAND = "HARVEST";

    public static void main(String[] args) {
        ICommandExecutor executor = new CommandExecutor();
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        while (!command.equals(TERMINATE_COMMAND)) {
            executor.execute(command);
            command = in.nextLine();
        }
    }
}