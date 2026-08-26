//import java.util.ArrayList;
//import java.util.EmptyStackException;
//import java.util.List;
//
//public class SetOfStacks {
//    private List<Stack<Integer>> stacks = new ArrayList<>();
//    private int capacity; // Max capacity of each stack
//
//    // Constructor to set the capacity for each stack
//    public SetOfStacks(int capacity) {
//        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be greater than 0");
//        this.capacity = capacity;
//    }
//
//    // Get the last stack
//    private Stack<Integer> getLastStack() {
//        if (stacks.size() == 0) return null;
//        return stacks.get(stacks.size() - 1);
//    }
//
//    // Push an element onto the set of stacks
//    public void push(int value) {
//        Stack<Integer> last = getLastStack();
//        if (last != null && last.size() < capacity) {
//            last.push(value);
//        } else {
//            Stack<Integer> newStack = new Stack<>();
//            newStack.push(value);
//            stacks.add(newStack);
//        }
//    }
//
//    // Pop an element from the set of stacks
//    public int pop() {
//        Stack<Integer> last = getLastStack();
//        if (last == null) throw new EmptyStackException();
//        int value = last.pop();
//        if (last.size() == 0) {
//            stacks.remove(stacks.size() - 1); // Remove the last stack if it becomes empty
//        }
//        return value;
//    }
//
//    // Pop an element from a specific sub-stack
//    public int popAt(int index) {
//        if (index < 0 || index >= stacks.size()) throw new IndexOutOfBoundsException("Invalid stack index");
//        Stack<Integer> stack = stacks.get(index);
//        if (stack.isEmpty()) throw new EmptyStackException();
//        int value = stack.pop();
//        shiftLeft(index);
//        return value;
//    }
//
//    // Shift elements to the left to fill the gap if a pop occurs from a sub-stack
//    private void shiftLeft(int index) {
//        // Check if there's a next stack to shift elements from
//        for (int i = index; i < stacks.size() - 1; i++) {
//            Stack<Integer> currentStack = stacks.get(i);
//            Stack<Integer> nextStack = stacks.get(i + 1);
//            if (!nextStack.isEmpty()) {
//                currentStack.push(removeBottom(nextStack));
//            }
//            if (nextStack.isEmpty()) {
//                stacks.remove(i + 1); // Remove the empty stack
//            }
//        }
//    }
//
//    // Remove the bottom element from a stack (this simulates rolling over the elements)
//    private int removeBottom(Stack<Integer> stack) {
//        Stack<Integer> temp = new Stack<>();
//        while (stack.size() > 1) {
//            temp.push(stack.pop());
//        }
//        int bottom = stack.pop();
//        while (!temp.isEmpty()) {
//            stack.push(temp.pop());
//        }
//        return bottom;
//    }
//
//    // Check if the entire set of stacks is empty
//    public boolean isEmpty() {
//        return stacks.isEmpty();
//    }
//
//    // Test driver
//    public static void main(String[] args) {
//        SetOfStacks setOfStacks = new SetOfStacks(3); // Each stack has a capacity of 3
//
//        // Push elements
//        setOfStacks.push(1);
//        setOfStacks.push(2);
//        setOfStacks.push(3); // Stack 1 full
//        setOfStacks.push(4); // New stack created
//        setOfStacks.push(5);
//
//        System.out.println(setOfStacks.pop());  // Output: 5
//        System.out.println(setOfStacks.popAt(0));  // Output: 3 (pop from the first stack)
//        System.out.println(setOfStacks.pop());  // Output: 4
//        System.out.println(setOfStacks.pop());  // Output: 2
//        System.out.println(setOfStacks.pop());  // Output: 1
//    }
//}