package CycleDetection;
import java.util.ArrayList;
public class DirectedGraph {
    int V;
    ArrayList<Integer>[] adj;
    DirectedGraph(int V){
        this.V=V;
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] temp=new ArrayList[V];
        this.adj=temp;
        for(int i=0;i<V;i++){
            adj[i]=new ArrayList<>();
        }
    }

    void addEdge(int src,int dest){
        adj[src].add(dest);
    }
    
}
