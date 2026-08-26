package com.simplestcodings;

public class SearchNode {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(4);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(2);
        TreeNode subroot=new TreeNode(5);
        boolean ans=findNode(root,subroot);
        System.out.println(ans);
    }
    public static boolean findNode(TreeNode root,TreeNode subroot){
        if (root==null){
            return false;
        }
        if (root.val== subroot.val){
            return true;
        }return findNode(root.left,subroot) || findNode(root.right,subroot);
    }
}
