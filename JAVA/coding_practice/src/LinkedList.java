public class LinkedList {
    public static void main(String[] args) {
        Node n = new Node(2);
        n.next = new Node(4);
        n.next.next = new Node(5);
        n.next.next.next = new Node(7);
        n.appendToTail(9);
    }
}
class Node{
    int data;
    Node next = null;
    public Node(int d){
        data = d;
    }
    public void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
        System.out.println(end.data);
    }
    //Deletion of a node from the singly linked list
    public Node deleteNode(Node head,int d){
        Node n = head;
        if (n.data == d){
            return head.next;
        }
        while (n.next != null){
            if (n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
}
