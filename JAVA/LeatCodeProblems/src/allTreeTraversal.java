import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class allTreeTraversal {
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(3);
        root.left = new TreeNode2(9);
        root.right = new TreeNode2(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode2(15);
        root.right.right = new TreeNode2(7);
//        inOrder(root);
//        preOrder(root);
//        postOrder(root);
//        levelOrder(root);
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        int src = 0;
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
//        bfs(src,graph);
//        int  = 6; // Number of vertices
        boolean[] visited = new boolean[V];
//        dfs(0, graph, visited);

        List<String> ans = binaryTreePaths(root);
        System.out.println(ans);
    }
    public static void inOrder(TreeNode2 root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    public static void preOrder(TreeNode2 root){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        inOrder(root.left);
        inOrder(root.right);
    }
    public static void postOrder(TreeNode2 root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }
    public static void levelOrder(TreeNode2 root){
        if (root == null){
            return;
        }
        Queue<TreeNode2> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode2 node = q.poll();
            System.out.println(node.val);
            if (node.left != null){
                q.offer(node.left);
            }if (node.right != null){
                q.offer(node.right);
            }
        }
    }
    public static void bfs(int startNode, ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];

        q.offer(startNode);
        visited[startNode] = true;

        while (!q.isEmpty()) {
            int nodeId = q.poll();
            System.out.println(nodeId);

            for (Edge neighbor : graph[nodeId]) {
                if (!visited[neighbor.nbr]) {
                    q.offer(neighbor.nbr);
                    visited[neighbor.nbr] = true;
                }
            }
        }
    }
    public static void dfs(int startNode, ArrayList<Edge>[] graph, boolean[] visited){
        visited[startNode] = true;
        System.out.println(startNode);
        for (Edge neighbor:graph[startNode]) {
            if (!visited[neighbor.nbr]){
                dfs(neighbor.nbr,graph,visited);
            }
        }
    }
    public static List<String> binaryTreePaths(TreeNode2 root){
        List<String> result = new ArrayList<>();
//        result.add(root.val,"");
        String s= "";
        s+=root.val;
        binaryTreePaths(root.left);
        result.add(s);
        binaryTreePaths(root.right);
        return result;
    }
}
class TreeNode2{
    int val;
    TreeNode2 left,right;
    TreeNode2(int data){
        val = data;
    }
}
class Edge {
    int src;
    int nbr;
    Edge(int src, int nbr){
        this.src = src;
        this.nbr = nbr;
    }
}