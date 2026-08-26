import java.util.ArrayList;
/*
You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Example 1:
Input: root = [1,2,3,4,5,6,7]
Output: [1,#,2,3,#,4,5,6,7,#]
Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node,
just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
 */
public class PopulatingNextRightPointerInEachNode {
    public static void main(String[] args) {
        Node root=new Node(1);
//        root.next=null;
    }
    ArrayList<Integer> result=new ArrayList<>();

}
//class Node{
//    int data;
//    Node left,right,next;
//    public Node(int key){
//        key=data;
//    }
//}

