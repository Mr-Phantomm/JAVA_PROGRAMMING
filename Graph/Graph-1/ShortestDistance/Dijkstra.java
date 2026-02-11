package ShortestDistance;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Dijkstra {

    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }

    public static class Pair{
        int node;
        int dist;
        Pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }



    public static int[] dikstra(ArrayList<ArrayList<Edge>> adj,int src){
        int[] dist=new int[adj.size()];
        PriorityQueue<Pair> pq=new PriorityQueue<>((Pair a,Pair b)->{
            if(a.dist<b.dist)return -1;
            if(a.dist>b.dist)return 1;
            return 0;
        });
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        pq.offer(new Pair (src,0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            if(curr.dist<dist[curr.node]){
                dist[curr.node]=curr.dist;
            }
            else continue;

            for(int i=0;i<adj.get(curr.node).size();i++){
                Edge next=adj.get(curr.node).get(i);
                pq.offer(new Pair(next.dest,next.wt+curr.dist));
            }
        }
        

        return dist;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int v=obj.nextInt();
        int e=obj.nextInt();
        ArrayList<ArrayList<Edge>> adj=new ArrayList<>();
        
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int src=obj.nextInt();
            int dest=obj.nextInt();
            int wt=obj.nextInt();
            adj.get(src).add(new Edge(src,dest,wt));
        }

        int src=obj.nextInt();
        int[] dist= dikstra(adj,src);
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }

    }
}
