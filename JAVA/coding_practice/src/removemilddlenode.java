public class removemilddlenode {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(5);
        n.next.next.next.next.next = new Node(6);
        removeMiddle(n);
        Node head = n;
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void removeMiddle(Node head){
        if (head == null || head.next == null){
            return;
        }
        Node fast = head;
        Node slow = head;
        Node previous = null;
        while (fast != null && slow != null && fast.next != null){
            if (fast.next.next == null && previous != null){
                previous.next = slow.next;
            }
            previous = slow;
            slow = slow.next;

            fast = fast.next.next;
        }
        assert slow != null;
        previous.next = slow.next;
    }
}
