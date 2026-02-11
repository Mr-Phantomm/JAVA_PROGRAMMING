package Graph_Repractice.Cycle.Undirected;
import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

    public static boolean dfs(ArrayList<Integer>[] graph,int curr,boolean[] visited){
        if(visited[curr])return true;
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            int next=graph[curr].get(i);
            if(dfs(graph,next,visited))return true; 
        }
        return false;
    }

    public static boolean cycleDetection(int v ,int[][] edge){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edge.length;i++){
            graph[edge[i][0]].add(edge[i][1]);
            graph[edge[i][1]].add(edge[i][0]);
        }
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                if(dfs(graph,i,visited))return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int v=obj.nextInt();
        int e=obj.nextInt();
        int[][] edges=new int[e][2];
        for(int i=0;i<e;i++){
            edges[i][0]=obj.nextInt();
            edges[i][1]=obj.nextInt();
        }
        System.out.println((cycleDetection(v, edges)?"Cycle Detected":"No Cycle"));

    }
}
