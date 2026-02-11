import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Kosaraju {

    public static void dfs(int i,ArrayList<Integer>[] Graph,Stack<Integer> st,boolean[] visited){
        if(visited[i])return;
        visited[i]=true;
        for(int j=0;j<Graph[i].size();j++){
            int next=Graph[i].get(j);
            dfs(next,Graph,st,visited);
        }
        st.push(i);
    }

    public static void dfsUtil(ArrayList<Integer>[] Graph,Stack<Integer> st){
        boolean[] visited=new boolean[Graph.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfs(i,Graph,st,visited);
            }
        }
    }

    public static int numberOfStronglyConnectedComponent(int v,int[][] edge){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph=new ArrayList[v];
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] revGraph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
            revGraph[i]=new ArrayList<>();
        }
        for(int i=0;i<edge.length;i++){
            graph[edge[i][0]].add(edge[i][1]);
            revGraph[edge[i][1]].add(edge[i][0]);
        }
        Stack<Integer> st=new Stack<>();
        dfsUtil(graph,st);
        // System.out.println(st);
        boolean[] visited=new boolean[v];
        int count=0;
        while(!st.isEmpty()){
            int i=st.pop();
            // System.out.println(i);
            if(!visited[i]){
                dfsr(revGraph,i,visited);
                count++;
            }
        }
        return count;
    }
    public static void dfsr(ArrayList<Integer>[] graph,int i,boolean[] visited){
        if(visited[i])return;
        visited[i]=true;
        for(int j=0;j<graph[i].size();j++){
            int next=graph[i].get(j);
            dfsr(graph, next, visited);
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int vertices=obj.nextInt();
        int edges=obj.nextInt();
        int edge[][] =new int[edges][2];
        for(int i=0;i<edges;i++){
            edge[i][0]=obj.nextInt();
            edge[i][1]=obj.nextInt();
        }
        System.out.println(numberOfStronglyConnectedComponent(vertices, edge));
    }
}
