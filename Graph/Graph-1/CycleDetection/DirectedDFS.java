package CycleDetection;

import java.util.Stack;

public class DirectedDFS {
    
    public static boolean dfsUtil(DirectedGraph g,int curr,Stack<Integer> st,boolean[] visited){
        if(st.contains(curr))return true;
        if(visited[curr])return false;
        st.push(curr);
        visited[curr]=true;
        for(int i=0;i<g.adj[curr].size();i++){
            int next=g.adj[curr].get(i);
            if(dfsUtil(g, next, st, visited))return true;
        }
        st.pop();
        return false;
    }

    public static boolean dfs(DirectedGraph g){
        boolean[] visited=new boolean[g.V];
        for(int i=0;i<g.V;i++){
            if(!visited[i]){
                if(dfsUtil(g, i,new Stack<>(), visited)){
                    return true;
                }
            }
        }
        return false;
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
        g.addEdge(7,5);

        System.out.println(dfs(g));

   } 
}
