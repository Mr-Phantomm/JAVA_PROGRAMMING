import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class UndirectedGraph {

    public static void BFS(ArrayList<Integer>[] graph,int source,boolean[] visited){
        Queue<Integer> queue=new LinkedList<>();
        Queue<Integer> parent = new LinkedList<>(); 
        queue.offer(source);
        parent.offer(source);
        
        while(!queue.isEmpty()){
            int curr = queue.poll();
            int par = parent.poll();
            if(visited[curr]){
                continue;
            }
            System.out.print(curr+" ");
            visited[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                int c = graph[curr].get(i);
                if(c==par)continue;
                queue.offer(c);
                parent.offer(curr);
            }
        }
       

    }


    public static void DFS(ArrayList<Integer>[] graph,boolean[] visited,int curr,int par){
        if(visited[curr])return;
        visited[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            int c = graph[curr].get(i);
            if(c==par)continue;
            DFS(graph,visited,c,curr);
        }
    }

    public static void graph(int[][] edges,int vertices){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }
        boolean[] visited =new boolean[vertices];
        System.out.print("BFS : ");
        for(int i= 0 ;i<vertices;i++){
            if(!visited[i]){
                BFS(graph,i,visited);
            }
        }
         System.out.println();
         visited=new boolean[vertices];
         System.out.print("DFS : ");
        for(int i= 0 ;i<vertices;i++){
            if(!visited[i]){
                DFS(graph,visited,i,i);
            }
        }
         System.out.println();
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vertices = sc.nextInt();
        int noOfEdges = sc.nextInt();
        int edges[][] = new int[noOfEdges][2];
        for(int i=0;i<noOfEdges;i++){
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }
        graph(edges,vertices);
    }
}
