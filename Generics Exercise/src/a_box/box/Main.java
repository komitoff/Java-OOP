package a_box.box;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = Integer.valueOf(scanner.nextLine());

        List<Double> ints = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            ints.add(Double.valueOf(scanner.nextLine()));
        }

        int count = 0;
        Double last = Double.valueOf(scanner.nextLine());

        for (Double num : ints) {
            if (num > last) {
                count ++;
            }
        }

        System.out.println(count);
//        Box<String> box = new Box<>();
//
//        for (int i = 0; i < len; i++) {
//            String input = scanner.nextLine();
//            box.add(input);
//        }
////        String line = scanner.nextLine();
//////        int count = box.countGraterThan(line);
////        System.out.println(count);
//
////        int[] tokens = Arrays.stream(scanner.nextLine().split(" "))
////                .mapToInt(Integer::valueOf)
////                .toArray();
////        swap(tokens[0], tokens[1], boxList);
////        boxList.forEach(System.out::println);
    }

    private static <T> void swap(int firstIndex, int secondIndex, List<T> boxList) {
        Collections.swap(boxList, firstIndex, secondIndex);
    }
}
