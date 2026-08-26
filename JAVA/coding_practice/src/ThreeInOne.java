import java.util.EmptyStackException;

public class ThreeInOne {
    private int[] array;
    private int size;
    private int top1, top2, top3;

    public ThreeInOne(int size) {
        this.size = size;
        array = new int[size];
        top1 = -1; // Stack 1 starts from the left
        top2 = size / 3 - 1; // Stack 2 starts in the middle
        top3 = size; // Stack 3 starts from the right
    }

    // Push to stack 1
    public void push1(int value) {
        if (top1 + 1 == top2) {
            throw new StackOverflowError("Stack 1 is full");
        }
        array[++top1] = value;
    }

    // Push to stack 2
    public void push2(int value) {
        if (top2 + 1 == top3) {
            throw new StackOverflowError("Stack 2 is full");
        }
        array[++top2] = value;
    }

    // Push to stack 3
    public void push3(int value) {
        if (top3 - 1 == top2) {
            throw new StackOverflowError("Stack 3 is full");
        }
        array[--top3] = value;
    }

    // Pop from stack 1
    public int pop1() {
        if (top1 == -1) throw new EmptyStackException();
        return array[top1--];
    }

    // Pop from stack 2
    public int pop2() {
        if (top2 == size / 3 - 1) {
            throw new EmptyStackException();
        }
        return array[top2--];
    }

    // Pop from stack 3
    public int pop3() {
        if (top3 == size) {
            throw new EmptyStackException();
        }
        return array[top3++];
    }

    // Check if stack 1 is empty
    public boolean isEmpty1() {
        return top1 == -1;
    }

    // Check if stack 2 is empty
    public boolean isEmpty2() {
        return top2 == size / 3 - 1;
    }

    // Check if stack 3 is empty
    public boolean isEmpty3() {
        return top3 == size;
    }

    // Peek at the top of stack 1
    public int peek1() {
        if (top1 == -1) {
            throw new EmptyStackException();
        }
        return array[top1];
    }

    // Peek at the top of stack 2
    public int peek2() {
        if (top2 == size / 3 - 1) {
            throw new EmptyStackException();
        }
        return array[top2];
    }

    // Peek at the top of stack 3
    public int peek3() {
        if (top3 == size) {
            throw new EmptyStackException();
        }
        return array[top3];
    }

    public static void main(String[] args) {
        ThreeInOne stacks = new ThreeInOne(9);

        // Example usage
        stacks.push1(10);
        stacks.push2(20);
        stacks.push3(30);
        System.out.println("Popped from stack 1: " + stacks.pop1());
        System.out.println("Popped from stack 2: " + stacks.pop2());
        System.out.println("Popped from stack 3: " + stacks.pop3());
    }
}
