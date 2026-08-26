/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.Next=new ListNode(4);
        l1.Next.Next=new ListNode(3);
        l1.Next.Next.Next=null;
        ListNode l2=new ListNode(5);
        l2.Next=new ListNode(6);
        l2.Next.Next=new ListNode(4);
        l2.Next.Next.Next=null;
//        System.out.println(addTwoNumbers(l1,l2));
        ListNode res=addTwoNumbers(l1,l2);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.Next = newNode;
            tail = tail.Next;

            l1 = (l1 != null) ? l1.Next : null;
            l2 = (l2 != null) ? l2.Next : null;
        }

        ListNode result = dummyHead.Next;
        dummyHead.Next = null;
        return result;
    }
}
class ListNode{
    int val;
    ListNode Next;
    public ListNode(int val){
        this.val=val;
        Next=null;
    }
}
