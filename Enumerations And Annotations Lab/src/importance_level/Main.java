package importance_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String loggerImportance = reader.readLine();
        Logger logger = new Logger(loggerImportance);


        String input = reader.readLine();
        while (!"END".equals(input)) {

            String[] tokens = input.split(":");
            Message message = new Message(tokens[0].trim(), tokens[1].trim());
            logger.log(message);
            input = reader.readLine();
        }
        Iterable<Message> messages = logger.getMessages();
        messages.forEach(System.out::println);
    }
}
