public class subtreeOfAnotherThree {
    public static void main(String[] args) {

    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot){
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (helper(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static boolean helper(TreeNode n1, TreeNode n2){
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null || n1.val != n2.val) {
            return false;
        }
        return helper(n1.left, n2.left) && helper(n1.right, n2.right);
    }
}
