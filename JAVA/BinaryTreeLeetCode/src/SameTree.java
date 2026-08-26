public class SameTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        TreeNode root2=new TreeNode(1);
        root2.left=new TreeNode(2);
        root2.right=new TreeNode(3);
        boolean ans=isSameTree(root,root2);
        System.out.println(ans);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p.left==null&&q.left==null||p.right==null&&q.right==null){
            if (p.left.data==q.left.data||p.right.data==q.right.data){
                return true;
            }if (p.right.data==q.right.data&&p.left.data==q.left.data){
                return true;
            }
        }
        if (p.right.data==q.right.data&&p.left.data==q.left.data){
            return true;
        }
        return false;
    }
}
