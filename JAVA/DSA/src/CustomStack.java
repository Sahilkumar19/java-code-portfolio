import java.util.ArrayList;
import java.util.EmptyStackException;

public class CustomStack {
    public static void main(String[] args) {
    }
}
class Stack<T>{
    private ArrayList<T> list;
    public Stack(){
        list=new ArrayList<T>();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void push(T val){
        list.add(val);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(list.size()-1);
    }
    public int size(){
        return list.size();
    }

    public static void main(String[] args) {

    }
}
