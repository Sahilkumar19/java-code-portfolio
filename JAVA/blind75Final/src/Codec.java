import java.util.*;

public class Codec {

    public static void main(String[] args) {

    }

    // Recursive serialization helper
    public String recserialize(TreeNode root, String str) {
        if (root == null) {
            str += "null,";
        } else {
            str += String.valueOf(root.val) + ",";
            str = recserialize(root.left, str);
            str = recserialize(root.right, str);
        }
        return str;
    }

    // Encodes a tree to a single string
    public String serialize(TreeNode root) {
        return recserialize(root, "");
    }

    // Recursive deserialization helper
    public TreeNode recDesrialize(List<String> str) {
        if (str.size() == 0) { // Safety check for empty list
            return null;
        }
        if (str.get(0).equals("null")) {
            str.remove(0); // Remove "null" and return null
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(str.get(0))); // Create new node
        str.remove(0); // Remove processed value
        root.left = recDesrialize(str); // Deserialize left subtree
        root.right = recDesrialize(str); // Deserialize right subtree
        return root;
    }

    // Decodes your encoded data to tree
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) { // Handle empty input string
            return null;
        }
        String[] strArray = data.split(",");
        List<String> strList = new LinkedList<>(Arrays.asList(strArray));
        return recDesrialize(strList);
    }
}