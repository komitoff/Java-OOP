package lab.random_arr_list;

import java.util.ArrayList;

public class StackOfStrings {

    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String element) {
        this.data.add(element);
    }

    public String pop() {
        String lastElement = this.data.get(this.data.size() - 1);
        this.data.remove(this.data.size() - 1);
        return lastElement;
    }

    public String peek() {
        return this.data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
