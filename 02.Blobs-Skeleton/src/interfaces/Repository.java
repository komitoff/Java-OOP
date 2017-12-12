package interfaces;

public interface Repository<T> {
    T findOneByName(String name);

    void add(T element);
}
