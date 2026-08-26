import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class tree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
//        root.right.left=new TreeNode(6);
//        root.right.right=new TreeNode(7);
        DFS(root);
    }
//    ------------------------------------------------------------------ SEARCHING --------------------------------------------------------------------------------
    //queue-FIFO
    public static void BFS(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if (node.right!=null){
                queue.add(node.right);
            }if (node.left!=null){
                queue.add(node.left);
            }
        }
    }

    // no need of visited[] because its a tree not a graph ....stack is used in this - LIFO
    public static void DFS(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node=stack.pop();
            System.out.println(node.data);
            if (node.right!=null){
                stack.push(node.right);
            }if (node.left!=null){
                stack.push(node.left);
            }
        }
    }
}
class TreeNode{
    int data;
    TreeNode left, right;
    public TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}