import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class CycleDetection_Directed {

    public static boolean BFS(ArrayList<Integer>[] graph,int source,boolean[] visited){
        int[] inorder = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                inorder[graph[i].get(j)]++;
            }
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(inorder[i]==0){
                queue.offer(i);
            }
        }
        int v = 0 ;
        while(!queue.isEmpty()){
            int curr=queue.poll();
            if(visited[curr])return true;
            visited[curr]=true;
            v++;
            for(int i=0;i<graph[curr].size();i++){
                int c = graph[curr].get(i);
                inorder[c]--;
                if(inorder[c]==0)queue.offer(c);
            }

        }
        // if(v!=graph.length)return true;
        return false;
    }

    public static void graph(int[][] edges,int vertices){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph=new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);

        }

        boolean visited[] = new boolean[vertices];
        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                if(BFS(graph,i,visited)){
                    System.out.println("Cycle detected");
                }
                else{
                    System.out.println("No Cycle");
                }
            }
        }
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