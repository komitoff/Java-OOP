package black_box_integer;

import java.util.Scanner;

public class Main {
    private static final String TERMINATE_COMMAND = "END";
    private static final String SPLIT_STRING = "_";

    public static void main(String[] args) throws Exception {
        CommandExecutor executor = new CommandExecutor();
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        while (!command.equals(TERMINATE_COMMAND)) {
            String[] data = command.split(SPLIT_STRING);
            executor.execute(data[0], Integer.parseInt(data[1]));
            command = in.nextLine();
        }
    }
}