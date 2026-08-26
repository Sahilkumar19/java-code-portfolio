package com.simplestcodings;

public class tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        TreeNode root2=new TreeNode(1);
        root2.left=null;
        root2.right=new TreeNode(2);
//        System.out.println(root2.left.val);
    }
}
class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val=val;
        left=right=null;
    }
}
