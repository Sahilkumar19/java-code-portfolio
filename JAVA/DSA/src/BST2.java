public class BST2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            System.out.println("node to insert "+data);
        }
    }

    public static Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public static void inorderTraverse(Node root) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.left);
        System.out.println("Current Node: " + root.data);
        inorderTraverse(root.right);
//        if (root.left != null) {
//            System.out.print("\tLeft: " + root.left.data);
//        } else {
//            System.out.print("\tLeft: null");
//        }
//        if (root.right != null) {
//            System.out.print("\tRight: " + root.right.data);
//        } else {
//            System.out.print("\tRight: null");
//        }
//        System.out.println();
//        inorderTraverse(root.right);
    }
    public static boolean searchTree(Node root,int key){
        if (root==null){
            return false;
        }
        else {
            if (key< root.data){
                return searchTree(root.left,key);
            } else if (key == root.data) {
                return true;
            }else {
                return searchTree(root.right,key);
            }
        }
    }
    public static Node inorderSuccessor(Node root) {
        while(root.left!=null) {
            root=root.left;
        }
        System.out.println(root.data);
        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        int a[] = {3, 5, 1, 4, 2};
        for (int n : a) {
            root = insertNode(root, n);
        }
        System.out.println("Inorder traversal:");
        inorderTraverse(root);
        boolean ans = searchTree(root,3);
        System.out.println(ans);
        inorderSuccessor(root);
    }
}
