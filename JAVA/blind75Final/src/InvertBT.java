public class InvertBT {
    public static void main(String[] args) {

    }
    public static TreeNode invertTree(TreeNode root){
        TreeNode tempRight=root.right;
        root.right=invertTree(root.left);
        root.left=invertTree(tempRight);
        return root;
    }
}
