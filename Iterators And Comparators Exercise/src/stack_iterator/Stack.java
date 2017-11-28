package stack_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<Integer> implements Iterable<Integer> {

    private List<Integer> elements;

    public Stack() {
        this.elements = new ArrayList<>();
    }

    public void push(Integer... numbers) {
        for (Integer number : numbers) {
            elements.add(number);
        }
    }

    public Integer pop() {
        if (elements.size() == 0) {
            return null;
        }
        Integer last = elements.get(elements.size() - 1);
        return last;
    }

    public int size() {
        return elements.size();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }


    private final class StackIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }
    }
}
