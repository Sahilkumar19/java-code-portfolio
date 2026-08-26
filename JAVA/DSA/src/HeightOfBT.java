//depth:
//
//        if p is the root, then the depth of p is 0
//        otherwise, the depth of p is one plus the depth of parent of p


//        height:
//
//        if p is a leaf, then the height of p is 0
//        otherwise, the height of p is one more than the maximum of the heights of p's children
public class HeightOfBT {
    public static int Height(node root) {
        //checking the base condition if there is no tree
        if (root == null) {
            return 0;
        }
        // height of any subtree in a binary tree is 1 more than the maximum of it's left and right subtree in that node of the subtree.
        return 1 + Math.max(Height(root.left), Height(root.right));

    }



    public static void main(String[] args) {
        // creating the nodes of the tree
        node root=new node(15);
        root.left=new node(6);
        root.right=new node(9);
        root.left.left=new node(8);
        root.left.right=new node(14);
        root.left.left.right=new node(10);
    //calling the Height method to get the height of a binary tree and storing the returned value in the ans variable
        int ans=Height(root);
        System.out.println("The height of the binary tree is:"+ " "+ ans);

    }
}
class node {
    int data;
    node left, right;

    public node(int key) {
        data = key;
        left = right = null;
    }
}
