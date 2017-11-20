package c.heavier;

public class Main {
    public static void main(String[] args) {
        Scale<String> strings = new Scale<>("a", "b");
        System.out.println(strings.getHeavier());

        Scale<Integer> ints = new Scale<>(1, 2);
        System.out.println(ints.getHeavier());


    }
}
