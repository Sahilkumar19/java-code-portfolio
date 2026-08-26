import java.util.*;

public class DJV65 {
    public static class Edge{
        int src;
        int nbr;
        int wt;
        Edge(int src, int nbr, int wt){
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    public static class Pair implements Comparable<Pair>{
        int vt;
        int wsf;

        Pair(int vt, int wsf){
            this.vt=vt;
            this.wsf=wsf;
        }

        public int compareTo(Pair p) {
            return this.wsf-p.wsf;
        }
    }
    public static void DJ(ArrayList<Edge> graph[],int s, int V) {
        boolean vis[] = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(s,0));

        while(!pq.isEmpty()) {
            Pair TE = pq.remove();

            if(vis[TE.vt]==true) {
                continue;
            }
            vis[TE.vt]=true;

            System.out.println("Vertex: "+TE.vt+"\tWeight: "+TE.wsf);

            for(Edge e:graph[TE.vt]) {
                if(vis[e.nbr]==false) {
                    pq.add(new Pair(e.nbr,e.wt+TE.wsf));
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        DJ(graph,0,V);

    }
}
