package stack_iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Stack stack = new Stack<>();

        while (!input.equals("END")) {

            if (input.equals("Pop")) {
                if (stack.size() == 0) {
                    System.out.println("No elements");
                }
                else {
                    System.out.println(stack.pop());
                }
            }
            else {
                int[] nums = getNumbers(input.substring(5, input.length()));
                try {
                    stack.push(nums);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


            input = reader.readLine();
        }


    }

    public static int[] getNumbers(String input) {
        int[] nums = Arrays.stream(input.split(", "))
                .mapToInt(Integer::valueOf)
                .toArray();
        return nums;
    }
}
