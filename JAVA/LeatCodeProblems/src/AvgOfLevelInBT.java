/*
Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.

Input: root = [3,9,20,null,null,15,7]
Output: [3.00000,14.50000,11.00000]
Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
Hence return [3, 14.5, 11].
 */
import java.util.*;
public class AvgOfLevelInBT {
    public static void main(String[] args) {
        Treenode root=new Treenode(3);
        root.left=new Treenode(9);
        root.right=new Treenode(20);
        root.left.left=null;
        root.left.right=null;
        root.right.left=new Treenode(15);
        root.right.right=new Treenode(7);

        List<Double> result=averageOfLevels(root);
        System.out.println(result);
    }
    public static List<Double> averageOfLevels(Treenode root){
        List<Double> result=new ArrayList<>();
        Queue<Treenode> queue=new LinkedList<>();
        queue.offer(root);
        if (root==null){
            return result;
        }
        while (!queue.isEmpty()){
            int levelsize=queue.size();
            Double levelsum=0.0;
            for (int i = 0; i < levelsize; i++) {
                Treenode currentNode=queue.poll();
                levelsum+=currentNode.data;
                if (currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if (currentNode.right!=null){
                    queue.offer(currentNode.right);
                }

            }
            levelsum=levelsum/levelsize;
            result.add(levelsum);
        }
        return result;
    }
}
class Treenode{
    int data;
    Treenode left,right;
    public Treenode(int key){
        key=data;
        left=right=null;
    }
}
