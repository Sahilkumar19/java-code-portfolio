public class buildBST {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,20};
        TreeNode3 ans = makeBSTFromArray(array, 0, array.length-1);
        System.out.println(ans.val);
    }
    public static TreeNode3 makeBSTFromArray(int[] array, int s, int e){
        if (e < s){
            return null;
        }
        int mid = array[s+e/2];
        TreeNode3 node = new TreeNode3(mid);
        node.left = makeBSTFromArray(array, s, mid - 1);
        node.right = makeBSTFromArray(array, mid + 1, e);
        return node;
    }

}
class TreeNode3{
    int val;
    TreeNode3 left,right;
    TreeNode3(int data){
        val = data;
        left = right = null;
    }
}