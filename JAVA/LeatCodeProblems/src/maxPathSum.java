//public class maxPathSum {
//    public static void main(String[] args) {
//        Node root = new Node(-10);
//        root.left=new Node(9);
//        root.right = new Node(20);
//        root.left.left=null;
//        root.left.right=null;
//        root.right.left=new Node(15);
//        root.right.right=new Node(7);
//        int ans = maxSum(root);
//        System.out.println(ans);
//    }
//    public static int maxSum(Node root){
//        if (root == null){
//            return 0;
//        }
//        return root.val+Math.max(maxSum(root.left),maxSum(root.right));
//    }
//}
//class Node{
//    public Node next;
//    int val;
//    Node left,right;
//    Node(int data){
//        val=data;
//        left=right=null;
//    }
//}