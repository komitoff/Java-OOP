package a_box.box;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = Integer.valueOf(scanner.nextLine());
        Box<String> box = new Box<>();

        for (int i = 0; i < len; i++) {
            String input = scanner.nextLine();
            Box box = new Box(input);
            boxList.add(box);
        }
        String line = scanner.nextLine();


//        int[] tokens = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::valueOf)
//                .toArray();
//        swap(tokens[0], tokens[1], boxList);
//        boxList.forEach(System.out::println);
    }

    private static <T> void swap(int firstIndex, int secondIndex, List<T> boxList) {
        Collections.swap(boxList, firstIndex, secondIndex);
    }
}
