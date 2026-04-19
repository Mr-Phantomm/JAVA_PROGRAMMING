import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class kosaraju {

    public static void TopologicalSort(ArrayList<Integer>[] graph,int src,boolean[] visited,Stack<Integer> st){
        if(visited[src])return;
        visited[src]=true;
        for(int i=0;i<graph[src].size();i++){
            TopologicalSort(graph, graph[src].get(i), visited, st);
        }
        st.push(src);
    }

    public static void DFS(ArrayList<Integer>[] graph,int src,boolean[] visited){
        if(visited[src])return;
        visited[src]=true;
        for(int i=0;i<graph[src].size();i++){
            DFS(graph,graph[src].get(i),visited);
        }
    }

    public static int graph(int vertices,int[][] edges){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] revgraph = new ArrayList[vertices];
        
        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<>();
            revgraph[i]=new ArrayList<>();
        }
        
        for(int i =0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            revgraph[v].add(u);
        }

        boolean[] visited = new boolean[vertices];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                TopologicalSort(graph, i, visited, st);
            }
        }

        int components = 0;
        visited=new boolean[vertices];
        while(!st.isEmpty()){
            int curr = st.pop();
            if(!visited[curr]){
                DFS(revgraph,curr,visited);
                components++;
            }
        }
        return components;




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edge = sc.nextInt();
        int[][] edges = new int[edge][2];
        for(int i=0;i<edge;i++){
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }
        System.out.println(graph(vertices, edges));

    }
}
