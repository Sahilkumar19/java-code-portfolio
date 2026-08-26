public class MaxDepthBT {
    public static void main(String[] args) {

    }
    public static int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int data){
        val=data;
        left=right=null;
    }
}
