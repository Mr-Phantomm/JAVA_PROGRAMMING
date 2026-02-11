package Graph_Repractice.Cycle.Undirected;

import java.util.ArrayList;
import java.util.Scanner;

public class BFS {
    public static void boolean cycleDetection(int v ,int[][] edge){
        ArrayList<Integer> graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edge.length;i++){
            graph[edge[i][0]].add(edge[i][1]);
            graph[edge[i][1]].add(edge[i][0]);
        }
        
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
    }
}
