import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levelArr = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curNode = queue.poll();
                assert curNode != null;
                levelArr.add(curNode.val);
                if (curNode.left!=null){
                    queue.offer(curNode.left);
                }if (curNode.right!=null){
                    queue.offer(curNode.right);
                }

            }
            result.add(levelArr);
        }
        return result;
    }
}
