package TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static ArrayList<Integer> bfs(DirectedGraph g){
        int indegree[]=new int[g.V];
        for(int i=0;i<g.V;i++){
            for(int j=0;j<g.adj[i].size();j++){
                indegree[g.adj[i].get(j)]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }

        ArrayList<Integer> list=new ArrayList<>();

        while(!queue.isEmpty()){
            int curr=queue.poll();
            list.add(curr);
            for(int i=0;i<g.adj[curr].size();i++){
                indegree[g.adj[curr].get(i)]--;
                if(indegree[g.adj[curr].get(i)]==0){
                    queue.offer(g.adj[curr].get(i));
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {
         DirectedGraph g=new DirectedGraph(8);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(0,4);

        g.addEdge(5, 6);
        g.addEdge(6,7);
        // g.addEdge(7,5);
        System.out.println(bfs(g));


    }
}
