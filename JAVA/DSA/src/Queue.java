import java.util.EmptyStackException;
import java.util.LinkedList;
public class Queue<T> {
    private LinkedList<T> items;
    public Queue() {
        items = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(T item) {
        items.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.remove();
    }

    public int size() {
        return items.size();
    }
}


