public class KthToLast {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(5);
        n.next.next.next.next.next = new Node(6);
        n.next.next.next.next.next.next = new Node(7);
        int ans = returnKthToLast(n, 4);
        System.out.println(ans);
    }
    //1. trivial and bruteforce approach: by finding the length of the linked list and then returning (the length - k)th element;
    public static int returnKthToLast(Node head, int k){
        Node originalHead = head;
        int counterLength = 0;
        while (head != null){
            counterLength++;
            head = head.next;
        }
        int requiredNode = counterLength - k + 1;
        Node n = null;
        while ( originalHead != null && requiredNode>=1){
            n = originalHead;
            originalHead = originalHead.next;
            requiredNode--;
        }
        assert n != null;
        return n.data;
    }
}
