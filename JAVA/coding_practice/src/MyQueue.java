//import java.util.Stack;
public class MyQueue<T> {
    private Stack<T> stackNewest, stackOldest;

    // Constructor to initialize the stacks
    public MyQueue() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    // Add an element to the end of the queue
    public void enqueue(T value) {
        stackNewest.push(value);
    }

    // Remove the element from the front of the queue
    public T dequeue() {
        shiftStacks(); // Ensure stackOldest has the current elements
        if (stackOldest.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackOldest.pop();
    }

    // Get the front element of the queue
    public T peek() {
        shiftStacks(); // Ensure stackOldest has the current elements
        if (stackOldest.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackOldest.peek();
    }

    // Transfer elements from stackNewest to stackOldest if stackOldest is empty
    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stackNewest.isEmpty() && stackOldest.isEmpty();
    }

    // Test driver
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        // Enqueue elements
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        // Peek at the front element
        System.out.println("Peek: " + myQueue.peek()); // Output: 1

        // Dequeue elements
        System.out.println("Dequeue: " + myQueue.dequeue()); // Output: 1
        System.out.println("Dequeue: " + myQueue.dequeue()); // Output: 2

        // Enqueue more elements
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        // Dequeue and Peek
        System.out.println("Peek: " + myQueue.peek()); // Output: 3
        System.out.println("Dequeue: " + myQueue.dequeue()); // Output: 3
        System.out.println("Dequeue: " + myQueue.dequeue()); // Output: 4
        System.out.println("Dequeue: " + myQueue.dequeue()); // Output: 5

        // Check if the queue is empty
        System.out.println("Is queue empty? " + myQueue.isEmpty()); // Output: true
    }
}
