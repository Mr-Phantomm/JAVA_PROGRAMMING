// package mst;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class prim {
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

    public static class pair{
        int node;
        int dist;
        int par;
        pair(int node,int dist,int par){
            this.node=node;
            this.dist=dist;
            this.par=par;
        }
    }

    public static int prims(ArrayList<Edge>[] adj){
        PriorityQueue<pair> pq=new PriorityQueue<>((pair a, pair b)->{
            if(a.dist<b.dist)return -1;
            if(a.dist>b.dist)return 1;
            return 0;
        });
        int cost=0;
        pq.offer(new pair(0,0,0));
        boolean[] visited=new boolean[adj.length];
        while(!pq.isEmpty()){
            pair curr=pq.poll();
            if(visited[curr.node])continue;
            visited[curr.node]=true;
            cost+=curr.dist;
            for(int i=0;i<adj[curr.node].size();i++){
                Edge ed=adj[curr.node].get(i);
                if(curr.par==ed.dest)continue;
                pq.offer(new pair(ed.dest,ed.wt,curr.node));
            }
            
        }
        return cost;
    }
    
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int v=obj.nextInt();
        int e=obj.nextInt();
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] adj=new ArrayList[v];
        
        for(int i=0;i<v;i++){
            adj[i]=new ArrayList<>();
        }

        for(int i=0;i<e;i++){
            int src=obj.nextInt();
            int dest=obj.nextInt();
            int wt=obj.nextInt();
            adj[src].add(new Edge(src,dest,wt));
            adj[dest].add(new Edge(dest,src,wt));
        }

        System.out.println(prims(adj));
        obj.close();

    }
}
