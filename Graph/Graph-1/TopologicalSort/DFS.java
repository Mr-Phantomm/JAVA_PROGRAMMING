package TopologicalSort;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {

    public static void dfsUtil(int curr,DirectedGraph g,boolean[] visited,Stack<Integer> st){
        if(visited[curr])return;
        visited[curr]=true;
        for(int i=0;i<g.adj[curr].size();i++){
            dfsUtil(g.adj[curr].get(i), g, visited, st);
        }
        st.push(curr);
    }

    public static ArrayList<Integer> dfs(DirectedGraph g){
        boolean[] visited=new boolean[g.V];
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfsUtil(i, g, visited, st);
            }
        }

        while(!st.isEmpty()){
            list.add(st.pop());
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
        g.addEdge(7,5);

        System.out.println(dfs(g));



    }
}
