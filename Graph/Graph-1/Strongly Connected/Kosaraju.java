import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Kosaraju {

    public static void TopologicalSort(Stack<Integer> st,ArrayList<Integer>[] Graph,int curr,boolean[] visited){
        if(visited[curr])return;
        visited[curr]=true;
        for(int i=0;i<Graph[curr].size();i++){
            int next=Graph[curr].get(i);
            TopologicalSort(st, Graph, next, visited);
        }
        st.push(curr);
    }

    public static void DFS(int curr,ArrayList<Integer>[] Graph,boolean[] visited){
        if(visited[curr])return;
        visited[curr]=true;
        for(int i=0;i<Graph[curr].size();i++){
            int next=Graph[curr].get(i);
            DFS(next,Graph,visited);
        }
    }
    
    public static int NumberOfStronglyConnected(int[][] edges,int vertices){
        ArrayList<Integer>[] Graph=new ArrayList[vertices];
        ArrayList<Integer>[] RevGraph=new ArrayList[vertices];

        for(int i=0;i<vertices;i++){
            Graph[i]=new ArrayList<>();
            RevGraph[i]=new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            Graph[edges[i][0]].add(edges[i][1]);
            RevGraph[edges[i][1]].add(edges[i][0]);

        }

        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        boolean[] visited=new boolean[vertices];

        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                TopologicalSort(st, Graph, i, visited);
            }
        }

        while(!st.isEmpty()){
            list.add(st.pop());
        }
        int Components=0;
        visited=new boolean[vertices];
        for(int i=0;i<list.size();i++){
            if(!visited[list.get(i)]){
                DFS(list.get(i),RevGraph,visited);
                Components++;
            }
        }
        return Components;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int vertices=obj.nextInt();
        int edge=obj.nextInt();
        int[][] edges=new int[edge][2];
        for(int i=0;i<edge;i++){
            edges[i][0]=obj.nextInt();
            edges[i][1]=obj.nextInt();
        }
        
        System.out.println("Number Of Connected Components "+ NumberOfStronglyConnected(edges,vertices));
        
    }
}