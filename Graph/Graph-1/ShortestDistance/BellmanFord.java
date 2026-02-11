package ShortestDistance;

import java.util.Arrays;
import java.util.Scanner;

public class BellmanFord {
    public static int[] shortestDis(int[][] edges,int v,int src){
        int[] dist=new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        for(int i=0;i<v-1;i++){
            for(int j=0;j<edges.length;j++){
                int sc=edges[j][0];
                int dest=edges[j][1];
                int wt=edges[j][2];
                if(dist[sc]==Integer.MAX_VALUE)continue;
                if(dist[sc]+wt<dist[dest]){
                    dist[dest]=dist[sc]+wt;
                }
            }
        }
        return dist;
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
        int src=obj.nextInt();
        int[] dist=shortestDis(edges,v,src);
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }

    }
}
