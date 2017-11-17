package ex.ex5.border_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> ids = new ArrayList<>();
        String command = reader.readLine();

        while (!"End".equals(command)) {
            String[] tokens = command.split(" ");
            if (!tokens[0].equals("Robot"))
                ids.add(tokens[tokens.length - 1]);
            command = reader.readLine();
        }

        String fakeNumber = reader.readLine();
        for (String id : ids) {
            if (id.endsWith(fakeNumber)) {
                System.out.println(id);
            }
        }
    }
}
