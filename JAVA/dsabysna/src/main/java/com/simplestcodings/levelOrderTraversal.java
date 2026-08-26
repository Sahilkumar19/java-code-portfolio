package com.simplestcodings;

public class levelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.right=new TreeNode(2);
        reverseLevelOrder(root);
    }
    public static void reverseLevelOrder(TreeNode root){
        if (root==null){
            return;
        }
        reverseLevelOrder(root.left);
        reverseLevelOrder(root.right);
        System.out.println(root.val);
    }
}
