package com.simplestcodings;

public class local_minima {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(3);
        root.right=new TreeNode(4);
        TreeNode ans=findLocalMinima(root);
        System.out.println(ans.val);
    }
    public static TreeNode findLocalMinima(TreeNode root){
        if ((root.left!=null||root.val<root.left.val)&&(root.right!=null||root.val<root.right.val)){
            return root;
        }if (root.val<root.left.val){
            return findLocalMinima(root.left);
        }else {
            return findLocalMinima(root.right);
        }
    }
}
