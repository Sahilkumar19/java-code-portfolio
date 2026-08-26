//
//class TiltOfBT {
//    public static void main(String[] args) {
//        TreeNode root=new TreeNode(1);
//        root.left=new TreeNode(2);
//        root.right=new TreeNode(3);
//        System.out.println(findTilt(root));
//    }
//    private int totalTilt = 0;
//
//    protected int valueSum(TreeNode node) {
//        if (node == null)
//            return 0;
//
//        int leftSum = this.valueSum(node.left);
//        int rightSum = this.valueSum(node.right);
//        int tilt = Math.abs(leftSum - rightSum);
//        this.totalTilt += tilt;
//
//        // return the sum of values starting from this node.
//        return node.data + leftSum + rightSum;
//    }
//
//    public static int findTilt(TreeNode root) {
//        this.totalTilt = 0;
//        this.valueSum(root);
//        return this.totalTilt;
//    }
//}