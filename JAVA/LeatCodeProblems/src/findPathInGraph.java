import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class findPathInGraph {
    public static void main(String[] args) {
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
        boolean ans  = findPathUsingBFS(src,7,graph);
        System.out.println(ans);
    }
    public static boolean findPathUsingBFS(int startNode, int targetNode, ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.offer(startNode);
        visited[startNode] = true;
        while (!q.isEmpty()){
            int nodeID = q.poll();
            if (nodeID == targetNode){
                return true;
            }
            for (Edge neighbor : graph[nodeID] ) {
                if (!visited[neighbor.nbr]){
                    q.offer(neighbor.nbr);
                    visited[neighbor.nbr] = true;
                }
            }
        }
        return false;
    }
}
