package CycleDetection;
import java.util.LinkedList;
import java.util.Queue;


public class UndirectedBFS {

    public static boolean bfs(Graph g,int src){
        Queue<Integer> queue=new LinkedList<>();
        Queue<Integer> parent=new LinkedList<>();
        queue.offer(src);
        parent.offer(src);
        boolean[] visited=new boolean[g.V];
        while(!queue.isEmpty()){
            int curr=queue.poll();
            int par=parent.poll();
            if(visited[curr])return true;
            visited[curr]=true;
            for(int i=0;i<g.adj[curr].size();i++){
                int next=g.adj[curr].get(i);
                if(par==next)continue;
                queue.offer(next);
                parent.offer(curr);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,0);
        System.out.println(bfs(g,0));
    }
    
}