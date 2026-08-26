import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(2);
        n.next.next.next.next = new Node(5);
        n.next.next.next.next.next = new Node(6);
        removeDuplicateElement(n);
        Node head = n;
        while (head.next != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void removeDuplicateElement(Node n){
        HashSet<Integer> hs = new HashSet<>();
        Node previous = null;
        while (n != null){
            if (hs.contains(n.data)){
                previous.next = n.next;
            }else{
                hs.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }
}
