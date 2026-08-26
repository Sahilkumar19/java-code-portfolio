public class SLinkedList {
    public static void main(String[] args) {
        // Create first node
        Node2 head = new Node2(1);

        // Create second node and connect it
        Node2 second = new Node2(4);
        head.next = second;
        second.back = head;

        // Create third node and connect it
        Node2 third = new Node2(6);
        second.next = third;
        third.back = second;

        Node2 ans =reverseDLL(head);
        System.out.println(ans.data);
        System.out.println(ans.next.data);

        // Now the list is: 1 <-> 4 <-> 6
    }
//    Question = Insert at the head of a Linked List

    public static Node insertNode(int val, Node head){
        Node newNode = new Node(val);
        newNode.next=head;
        return newNode;
    }

//    Question = Delete Last Node of Linked List

    public static Node deleteTail(Node head){
        Node tempHead = head;
        Node prev = null;
        while (head!=null){
            if (head.next==null){
                prev.next=null;
                break;
            }
            prev=head;
            head=head.next;
        }
        return tempHead;
    }

//    Question = Find the Length of a Linked List

    public static void findLengthLL(Node head){
        int length=0;
        while (head!=null){
            head=head.next;
            length+=1;
        }
        System.out.println(length);
    }

//    Question = Search an element in a Linked List

    public static boolean searchElement(Node head, int val){
        while (head!=null){
            if (head.data==val){
                return true;
            }else {
                head=head.next;
            }
        }
        return false;
    }

//    Question = Insert at end of Doubly Linked List

    public static Node2 insertAtLast(Node2 head, int k){
        Node2 tempHead=head;
        Node2 nxt;
        while (head!=null){
            if (head.next==null){
                nxt=new Node2(k);
                nxt.back=head;
                head.next=nxt;
                break;
            }
            head=head.next;
        }
        return tempHead;
    }

//    Question = Delete Last Node of a Doubly Linked List

    public static Node2 deleteNodeAtLast(Node2 head){
        Node2 tempHead = head;
        Node2 prev = null;
        while (head!=null){
            if (head.next==null){
                prev.next=null;
            }
            prev=head;
            head=head.next;
        }
        return tempHead;
    }

    //    1 -> 4 -> 6
    public static Node reverseSLL(Node head){
        Node cur=head;
        Node prev = null;
        while (cur!=null){
            Node nxt = cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        return prev;
    }
//    Question = Reverse a Doubly Linked List
//    1 <-> 4 <-> 6 == 6 <-> 4 <-> 1
    public static Node2 reverseDLL(Node2 head){
        Node2 prev=null;
        while (head.next!=null){
            Node2 nxt = head.next;
            Node2 temp = head;
            prev = nxt;
            head.next=prev;
        }
        return prev;
    }




}
class Node{
    int data;
    Node next;
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this.data=data;
        next=null;
    }
}

class Node2{
    int data;
    Node2 next;
    Node2 back;

    public Node2(int data, Node2 next, Node2 back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    public Node2(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}