public class Preorder {
    public static void preorder(Node2 root){
        if (root==null){
            return;
        }
        preorder(root.left);
        System.out.println(root.data + " ");
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node2 root=new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(5);
        root.left.left = null;
        root.left.right = new Node2(4);
        root.right.left = null;
        root.right.right = new Node2(7);
        root.left.right.left = new Node2(8);
        root.left.right.right=null;
        root.right.right.left=null;
        root.right.right.right=new Node2(11);
        preorder(root);
    }
}
class Node2{
    int data;
    Node2 left,right;
    public Node2(int key){
        data=key;
        left=right=null;
    }
}
