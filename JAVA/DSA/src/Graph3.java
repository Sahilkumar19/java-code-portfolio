import java.util.ArrayList;

public class Graph3 {
    public static class Edge3{
        int src;
        int dest;
        Edge3(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge3> Graph[]){
        for (int i = 0; i < Graph.length; i++) {
            Graph[i]=new ArrayList<Edge3>();
        }
        Graph[0].add(new Edge3(0,2));
        Graph[1].add(new Edge3(1,2));
        Graph[1].add(new Edge3(1,3));
        Graph[2].add(new Edge3(2,0));
    }

    public static void main(String[] args) {
    }
}
