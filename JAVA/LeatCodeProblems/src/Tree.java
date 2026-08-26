import com.sun.jdi.connect.spi.TransportService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class Tree {
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        Treenodep root=new Treenodep(3);
        root.left=new Treenodep(2);
        root.right=new Treenodep(1);
        root.left.left=new Treenodep(11);
        root.left.right=new Treenodep(10);
        Treenodep root2=new Treenodep(2);
        root2.left=new Treenodep(10);
        root2.right=new Treenodep(11);
//        int ans = height(root);
//        System.out.println(ans);
//        boolean ans = checkIdentical(root,root2);
//        System.out.println(ans);
//        boolean ans = checkSymmetric(root);
//        System.out.println(ans);
//        ArrayList<ArrayList<Integer>> ans = leveOrderTraversal(root);
//        System.out.println(ans);
//        boolean ans = checkSubtree(root,root2);
//        System.out.println(2);
//        System.out.println(ans);
//        int ans = kthLargestFromBT(root,2);
//        System.out.println(ans);
//        boolean ans  = validateBST(root);
//        System.out.println(ans);
//        max=Integer.MIN_VALUE;
        int ans  = getMaxPath(root);
        System.out.println(ans);
    }
    public static int height(Treenodep root){
        if (root==null){
            return 0;
        }
//        int l=0;
//        int r=0;
//        if (root.left!=null){
//            root=root.left;
//            l++;
//            height(root);
//        }if (root.right!=null){
//            root=root.right;
//            r++;
//            height(root);
//        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static boolean checkIdentical(Treenodep root1, Treenodep root2){
        if (root1==null && root2==null){
            return true;
        }
        if (root1==null || root2==null || root1.val!=root2.val){
            return false;
        }
        return checkIdentical(root1.left,root2.left) && checkIdentical(root1.right,root2.right);
    }
    public static boolean checkSymmetric(Treenodep root){
        if (root==null){
            return true;
        }
        return helper(root.left,root.right);
    }

    public static boolean helper(Treenodep n1, Treenodep n2) {
        if (n1==null && n2==null){
            return true;
        }
        if (n1==null || n2==null || n1.val!= n2.val){
            return false;
        }
        return helper(n1.left,n2.right)&&helper(n1.right,n2.left);
    }
    public static ArrayList<ArrayList<Integer>> leveOrderTraversal(Treenodep root){
        if (root==null){
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<Treenodep> q= new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int levelSize = q.size();
            ArrayList<Integer> temp=new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Treenodep node = q.poll();
                assert node != null;
                temp.add(node.val);
                if (node.left!=null){
                    q.offer(node.left);
                }if (node.right!=null){
                    q.offer(node.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
    public static boolean checkSubtree(Treenodep root, Treenodep subRoot){
        if (root==null && subRoot==null){
            return true;
        }
        if (helper(root,subRoot)){
            return true;
        }
        assert root != null;
        return helper2(root.left,subRoot) || helper(root.right,subRoot);
    }
    public static boolean helper2(Treenodep root, Treenodep subRoot) {
        if (root==null && subRoot==null){
            return true;
        }
        if (root==null || subRoot==null || root.val!= subRoot.val){
            return false;
        }
        return helper2(root.left,subRoot.left)&&helper2(root.right,subRoot.right);
    }
    public static int kthLargestFromBT(Treenodep root, int k){
        ArrayList<Integer> al = makeArray(root);
//        for largest min heep
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        for smallest maxheep
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for (int i = 0; i < al.size(); i++) {
            pq.offer(al.get(i));
            if (pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static ArrayList<Integer> makeArray(Treenodep root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<Treenodep> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int levelSIze = q.size();
            for (int i = 0; i < levelSIze; i++) {
                Treenodep n=q.poll();
                assert n != null;
                result.add(n.val);
                if (n.left!=null){
                    q.offer(n.left);
                }if (n.right!=null){
                    q.offer(n.right);
                }
            }
        }
        return result;
    }
    public static boolean validateBST(Treenodep root){
        return validateBSTHelper(root,null,null);
    }
    public static boolean validateBSTHelper(Treenodep root, Integer low, Integer high){
        if (root==null){
            return true;
        }
        if (low!=null && root.val<low){
            return false;
        }if (high!=null && root.val>high){
            return false;
        }
        boolean leftTree = validateBSTHelper(root.left,low,root.val);
        boolean rightTree = validateBSTHelper(root.right,root.val,high);
        return leftTree && rightTree;
    }
    public static int maxPathSumBT(Treenodep root){
//        int max=Integer.MIN_VALUE;
        if (root==null){
            return 0;
        }
        int leftSum = Math.max(0,maxPathSumBT(root.left));
        int rightSum = Math.max(0,maxPathSumBT(root.right));
        max = Math.max(max,leftSum+rightSum+root.val);
        return root.val+Math.max(leftSum,rightSum);
    }
    public static int getMaxPath(Treenodep root){
        max = Integer.MIN_VALUE;
        maxPathSumBT(root);
        return max;
    }
}
class Treenodep{
    int val;
    Treenodep left,right;
    Treenodep(int data){
        val=data;
        left=right=null;
    }
}