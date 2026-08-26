import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){
    }
    private static class Node{

        int value;
        static Node left;
        static Node right;
        public Node(int value){ //a constructor creating a new node
            this.value=value;
        }
    }
    private Node root;

    //insert element
    public void populate(Scanner scanner){
        System.out.println("enter the root node");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter in left of" +" "+ node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter the value of left child"+" "+ node.value);
            int value=scanner.nextInt();
            Node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter in right of" +" "+ node.value);
        boolean right=scanner.nextBoolean();
        if(right) {
            System.out.println("enter the value of right child" +" "+ node.value);
            int value = scanner.nextInt();
            Node.right = new Node(value);
            populate(scanner, node.right);
        }

    }
    public void display() {
        display(this.root, "");
    }
//    public int GetRootNode(){
//        return Node
//
//    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(Node.left, indent + "\t");
        display(Node.right, indent + "\t");
    }
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
    }


}
