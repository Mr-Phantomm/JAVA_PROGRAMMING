
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class prim {

    public static class edge{
        int src;
        int dest;
        int wt;
        edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }

    public static class Node{
        int node;
        int dist;
        Node(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }

    public static int mst(int v,int[][] edges){
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(new edge(edges[i][0],edges[i][1],edges[i][2]));
            graph[edges[i][1]].add(new edge(edges[i][1],edges[i][0],edges[i][2]));
        }

        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->{
            if(a.dist<b.dist)return -1;
            return 1;
        });

        boolean[] visited=new boolean[v];
        int cost=0;
        pq.offer(new Node(0,0));
        while(!pq.isEmpty()){
            Node curr=pq.poll();
            visited[curr.node]=true;
            cost+=curr.dist;
            for(int i=0;i<graph[curr.node].size();i++){
                edge next=graph[curr.node].get(i);
                if(!visited[next.dest]){
                    pq.offer(new Node(next.dest,next.wt));
                }
            }
        }
        return cost;


    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int v=obj.nextInt();
        int e=obj.nextInt();
        int[][] edges=new int[e][3];
        for(int i=0;i<e;i++){
            edges[i][0]=obj.nextInt();
            edges[i][1]=obj.nextInt();
            edges[i][2]=obj.nextInt();
        }
        System.out.println(mst(v,edges));
    }
}
