package CycleDetection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DirectedBFS {
    public static boolean bfs(DirectedGraph g){
        int[] indegree=new int[g.V];
        
        for(int i=0;i<g.V;i++){
            for(int j=0;j<g.adj[i].size();j++){
                indegree[g.adj[i].get(j)]++;
            }
        }

        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }

        int count=0;

        while(!queue.isEmpty()){
            int val=queue.poll();
            count++;
            for(int i=0;i<g.adj[val].size();i++){
                indegree[g.adj[val].get(i)]--;
                if(indegree[g.adj[val].get(i)]==0){
                    queue.offer(g.adj[val].get(i));
                }
            }
        }

        return count!=g.V;
    } 
    public static void main(String[] args) {
        DirectedGraph g=new DirectedGraph(8);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(0,4);
        
        g.addEdge(5, 6);
        // g.addEdge(6,7);
        g.addEdge(7,5);

        System.out.println(bfs(g));


    }
}
