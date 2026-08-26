import java.util.*;

public class InbuiltTypes {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(341);
//        stack.push(345);
//        stack.push(324);
//        stack.push(3);
//internally it is an array but then why we are not calling it an array? because of how its implemented(push and pop)
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue=new LinkedList<>();
//        queue.add(13);
//        queue.add(156);
//        queue.add(31);
//        queue.add(12);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());

        Deque<Integer> deque=new ArrayDeque<>();
        System.out.println(deque.add(3));
//        System.out.println(deque.addLast(34));
        System.out.println(deque.removeFirst());;



    }

}
