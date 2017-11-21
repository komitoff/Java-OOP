package custom_list.util_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();
        CustomListImpl<String> customList = new CustomListImpl<>();
        CommandParser<String> parser = new CommandParser<String>(customList);

        while (!"END".equals(command)) {
            parser.parseCommand(command);
            command = reader.readLine();
        }
    }
}
