public class reverseSLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node res = reverseSinglyLL(head);
        System.out.println(res.data);
    }
    public static Node reverseSinglyLL(Node head){
        Node curr = head;
        Node prev = null;
        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
