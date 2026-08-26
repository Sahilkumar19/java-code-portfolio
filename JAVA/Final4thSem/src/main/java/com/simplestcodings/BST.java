package com.simplestcodings;

public class BST {
    public static void main(String[] args) {

    }
    public static TreeNode insertNode(TreeNode root, int data){
        if (root==null){
            root=new TreeNode(data);
        } else if (data<root.data) {
            root.left=insertNode(root.left,data);
        } else if (data> root.data) {
            root.right=insertNode(root.right,data);
        }
        return root;
    }
    public static TreeNode SearchBst(TreeNode root, int val){
        while (root!=null && root.data!=val){
            if (root.data<val){
                root=root.right;
            }else {
                root=root.left;
            }
        }
        return root;
    }
}
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int key){
        key=data;
        left=right=null;
        System.out.println("node to insert "+key);
    }
}
