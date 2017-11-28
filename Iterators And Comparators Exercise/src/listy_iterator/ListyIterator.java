package listy_iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListyIterator implements Iterable<String> {

    private int index;
    private List<String> list;

    public ListyIterator(List<String> list) {
        this.setList(list);
        this.index = 0;
    }

    public List<String> getList() {
        return list;
    }

    private void setList(List<String> list) throws IllegalArgumentException {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.list = list;
    }

    public boolean move() throws IllegalArgumentException {
        if (index == list.size() - 1) {
            return false;
        }
        index ++;
        return true;
    }

    public void print() {
        System.out.println(list.get(index));
    }

    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        }

        return false;
    }

    public void printAll() {
        list.forEach((x) -> System.out.print(x + " "));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
