import java.util.EmptyStackException;

public class Stack<T> {

    private static class stackNode<T>{
        private T data;
        private stackNode<T> next;
        public stackNode(T data){
            this.data = data;
        }
    }
    private stackNode<T> top;
    public T pop(){
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }
    public void push(T item){
        stackNode<T> t = new stackNode<T>(item);
        t.next = top;
        top = t;
    }
    public T peek(){
        if (top == null)throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}