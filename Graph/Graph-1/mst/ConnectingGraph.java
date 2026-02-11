import java.util.PriorityQueue;
import java.util.Scanner;

public class ConnectingGraph {

    public static class pair{
        int node;
        int dist;
        pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    public static int min(int[][] adj){
        
        int cost=0;

        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->{
            if(a.dist<b.dist)return -1;
            if(a.dist>b.dist)return 1;
            return 0;
        });

        pq.offer(new pair(0,0));

        boolean[] visited=new boolean[adj.length];

        while(!pq.isEmpty()){
            pair curr=pq.poll();
            if(visited[curr.node])continue;
            visited[curr.node]=true;
            cost+=curr.dist;
            for(int i=0;i<adj[curr.node].length;i++){
                
                int next=adj[curr.node][i];
                if(next==0)continue;
                pq.offer(new pair(i,next));
            }
        }

        return cost;

    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[][] adj=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                adj[i][j]=obj.nextInt();
            }
        }

        
        System.out.println(min(adj));
        

    }
}
