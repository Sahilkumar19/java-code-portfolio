package Stack;
public class CustomStack {
     int[] data;
    int lastindx = -1;
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        lastindx++;
        data[lastindx] = item;
        return true;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Cannot pop from an empty stack");
        }
        return data[lastindx--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek from an empty stack");
        }
        return data[lastindx];
    }
    public boolean isFull() {
        return lastindx == data.length - 1;
    }
    public boolean isEmpty() {
        return lastindx == -1;
    }
}

