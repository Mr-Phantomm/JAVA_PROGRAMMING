package CycleDetection;

public class UndirectedDFS {

    public static boolean DFS(Graph g,int curr,int parent,boolean[] visited){
        if(visited[curr])return true;
        visited[curr]=true;
        for(int i=0;i<g.adj[curr].size();i++){
            int next=g.adj[curr].get(i);
            if(parent==next)continue;
            if(DFS(g,next,curr,visited))return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        // g.addEdge(4,0);
        System.out.println(DFS(g,0,0,new boolean[g.V]));
    }
}
