import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestBT {
    public static void main(String[] args) {

    }
    public static int smallest(TreeNode root, int k){
        ArrayList<Integer> al = buildArray(root);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);
        for (int i = 0; i < al.size(); i++) {
            pq.offer(al.get(i));
            if (pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static ArrayList<Integer> buildArray(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode nodeID = queue.poll();
                assert nodeID != null;
                result.add(nodeID.val);
                if (root.left!=null){
                    queue.offer(root.left);
                }if (root.right!=null){
                    queue.offer(root.right);
                }
            }
        }
        return result;
    }
}
