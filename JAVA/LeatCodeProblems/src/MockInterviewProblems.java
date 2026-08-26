import java.util.*;

public class MockInterviewProblems {
    public static void main(String[] args) {
        int[] arr = {2,7,5,1,7};
//        int ans = bestTime(arr);
//        System.out.println(ans);
        Treenodep root = new Treenodep(3);
        root.left=new Treenodep(9);
        root.right=new Treenodep(20);
        root.left.left=null;
        root.left.right=null;
        root.right.left=new Treenodep(15);
        root.right.right=new Treenodep(7);
//        int ans1 = maxDepthOfBT(root);
//        System.out.println(ans1);
        Nodep n1 = new Nodep(2);
        n1.next = new Nodep(4);
        n1.next.next = new Nodep(3);
        Nodep n2  = new Nodep(5);
        n2.next = new Nodep(6);
        n2.next.next = new Nodep(4);
//        Nodep ans = addTwoNumbers(n1,n2);
//        System.out.println(ans.val);
        String s = "({})";
//        boolean ans = checkValidParenthesis(s);
//        System.out.println(ans);
//        List<String> ans  = generateParenthesis(2);
//        System.out.println(ans);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
        }
    }
    public static int bestTime(int[] arr){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i:arr) {
            min = Math.min(i,min);
            int profit = i-min;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
    public static int maxDepthOfBT(Treenodep root){
        if (root==null){
            return 0;
        }return 1+Math.max(maxDepthOfBT(root.left),maxDepthOfBT(root.right));
    }
    public static Nodep addTwoNumbers(Nodep n1, Nodep n2) {
        Nodep dummyHead = new Nodep(0);
        Nodep tail = dummyHead;
        int carry = 0;
        while (n1 != null || n2 != null || carry != 0) {
            int digit1 = (n1 != null) ? n1.val : 0;
            int digit2 = (n2 != null) ? n2.val : 0;
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            Nodep newNode = new Nodep(digit);
            tail.next = newNode;
            tail = tail.next;

            n1 = (n1!=null) ? n1.next:null;
            n2 = (n2!=null) ? n2.next:null;
        }
        Nodep result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
    public static boolean checkValidParenthesis(String s){
        Hashtable<Character, Character> brackets = new Hashtable<>();
        brackets.put('(',')');
        brackets.put('{','}');
        brackets.put('[',']');
        HashSet<Character> open = new HashSet<>();
        open.add('(');
        open.add('{');
        open.add('[');
        Stack<Character> stack = new Stack<>();
        for (Character p : s.toCharArray()) {
            if (open.contains(p)){
                stack.push(p);
            } else if (!stack.isEmpty() && brackets.containsKey(stack.peek())) {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        int nop=0;
        int ncp=0;
        helper("",n,nop,ncp,result);
        return result;
    }
    public static void helper(String s,int n,int nop, int ncp, List<String> result){
        if (s.length()==2*n){
            result.add(s);
            return;
        }
        if (nop<n){
            helper(s+"(",n,nop+1,ncp,result);
        }
        if (ncp<nop){
            helper(s+")",n,nop,ncp+1,result);
        }
    }
}
class Nodep{
    int val;
    Nodep next;
    Nodep(int data){
        val=data;
        this.next=null;
    }
}
