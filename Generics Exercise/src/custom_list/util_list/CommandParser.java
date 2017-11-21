package custom_list.util_list;

import java.util.List;

public class CommandParser<T extends Comparable> {

    private CustomListImpl<T> elements;

    public CommandParser(CustomListImpl<T> elements) {
        this.elements = elements;
    }

    public void parseCommand(String tokens) {
        String[] cmd = tokens.split("\\s+");
        T element = null;
        switch (cmd[0]) {
            case "Add":
                element = (T) cmd[1];
                elements.add(element);
                break;
            case "Remove":
                int index = Integer.parseInt(cmd[1]);
                elements.remove(index);
                break;
            case "Contains":
                element = (T) cmd[1];
                System.out.println(elements.contains(element));
                break;
            case "Swap":
                int firstIndex = Integer.valueOf(cmd[1]);
                int secondIndex = Integer.valueOf(cmd[2]);
                elements.swap(firstIndex, secondIndex);
                break;
            case "Greater":
                element = (T) cmd[1];
                System.out.println(elements.countGreaterThan(element));
                break;
            case "Max":
                System.out.println(elements.getMax());
                break;
            case "Min":
                System.out.println(elements.getMin());
                break;
            case "Print":
                elements.forEach(System.out::println);
                break;
            case "Sort":
                elements.sort();
                break;
            default: break;
        }
    }
}
