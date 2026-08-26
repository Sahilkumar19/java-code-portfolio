import java.util.Stack;

public class SortStack {

    // Function to sort a stack
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        // Sort the original stack using the temporary stack
        while (!stack.isEmpty()) {
            // Pop out the top element from the original stack
            int current = stack.pop();

            // While temporary stack is not empty and top of tempStack is greater than current
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                // Push the top element of tempStack back to the original stack
                stack.push(tempStack.pop());
            }

            // Push the current element onto tempStack
            tempStack.push(current);
        }

        // Transfer sorted elements back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    // Test driver
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack:");
        System.out.println(stack);

        // Sort the stack
        sortStack(stack);

        System.out.println("Sorted Stack:");
        System.out.println(stack);
    }
}
