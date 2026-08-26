//import java.util.Stack;
public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push operation
    public void push(int value) {
        mainStack.push(value);

        // Push to minStack if it's empty or the current value is <= top of minStack
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Pop operation
    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = mainStack.pop();

        // If the popped value is the same as the top of the minStack, pop minStack as well
        if (value == minStack.peek()) {
            minStack.pop();
        }
        return value;
    }

    // Min operation
    public int min() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }

    // Peek operation for mainStack
    public int peek() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return mainStack.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);
        stack.push(8);

        System.out.println("Current Min: " + stack.min()); // Output: 2
        stack.pop();
        System.out.println("Current Min: " + stack.min()); // Output: 2
        stack.pop();
        System.out.println("Current Min: " + stack.min()); // Output: 3
    }
}
