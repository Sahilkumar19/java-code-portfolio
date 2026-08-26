import java.util.ArrayList;

public class Graph2 {
    public static class Edge2{
        char src, dest;
        public Edge2(char s,char d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void CreateGraph(ArrayList<Edge2> graph[]){
        for (int i = 0; i < graph.length; i++) {
//            System.out.println(graph[i]);
            graph[i]=new ArrayList<Edge2>();
//            System.out.println(graph[i]);
        }
        graph[0].add(new Edge2('A','B'));
        graph[0].add(new Edge2('A','C'));
        graph[1].add(new Edge2('B','A'));
        graph[1].add(new Edge2('B','C'));
        graph[2].add(new Edge2('C','A'));
        graph[2].add(new Edge2('C','B'));
    }

    public static void main(String[] args) {
        int v=3;
        ArrayList<Edge2> graph[] = new ArrayList[v];
//        CreateGraph(graph[]);
        for (int i = 0; i < graph[1].size(); i++) {
            Edge2 e = graph[1].get(i);
            System.out.println(e.src+" "+e.dest);
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge2 e = graph[i].get(j);
                System.out.println(e.src+" "+e.dest);
            }
            System.out.println();
        }
    }
}
