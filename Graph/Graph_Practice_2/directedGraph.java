import java.util.ArrayList;
public class directedGraph {

    public static void BFS(ArrayList<Integer>[] graph,int source,boolean[] visited){
        Queue<Integer> queue=new LinkedList<>();
        
    }

    public static void graph(int[][] edges,int vertices){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            graph[i]= new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
        }
        boolean[] visited=new boolean[vertices];
        for(int i=0;i<vertices;i++){

        }

    }
    public static void main(String[] args) {
        
    }
}
