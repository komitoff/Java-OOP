package listy_iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> items = Arrays.stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());
        items.remove(0);
        ListyIterator listyIterator = null;

        try {
            listyIterator = new ListyIterator(items);

            String command = reader.readLine();

            while (!command.equals("END")) {

                switch (command) {
                    case "Move" :
                        try {
                            System.out.println(listyIterator.move());
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Print" :
                        try {
                            listyIterator.print();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "HasNext" :
                        try {
                            System.out.println(listyIterator.hasNext());
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "PrintAll" :
                        try {
                            listyIterator.printAll();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    default:
                        break;
                }

                command = reader.readLine();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
