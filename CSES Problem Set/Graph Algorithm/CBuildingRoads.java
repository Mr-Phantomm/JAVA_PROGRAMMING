import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class CBuildingRoads {

    public static int find(int[] parent,int i){
        if(parent[i]==i)return i;
        return parent[i]=find(parent,parent[i]);
    }

    public static void union(int i,int j,int[] parent,int[] rank){
        int parA=find(parent,i);
        int parB=find(parent,j);
        if(parA==parB)return;
        if(rank[parA]==rank[parB]){
            rank[parA]++;
            parent[parB]=parA;
        }
        else if(rank[parA]>rank[parB]){
            parent[parB]=parA;
        }
        else{
            parent[parA]=parB;
        }
    }

    public static class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public static void DFS(ArrayList<Integer>[] graph,boolean[] visited,int i,int parent){
        if(visited[i])return;
        visited[i]=true;
        for(int j = 0;j<graph[i].size();j++){
            if(parent==graph[i].get(j))continue;
            DFS(graph,visited,graph[i].get(j),i);
        }
    } 

    public static void graph(int vertices,int[][] edges){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            // System.out.println(Arrays.toString(edges[i]));
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited= new boolean[vertices];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                result.add(i);
                DFS(graph,visited,i,i);
            }
        }

        System.out.println(result.size()-1);

        for(int i=0;i<result.size()-1;i++){
            System.out.println((result.get(i)+1)+" "+(result.get(i+1)+1));
        }

        // int[] parent = new int[vertices];
        // int[] rank = new int[vertices];
        // for(int i=0;i<vertices;i++){
        //     parent[i]=i;
        //     rank[i]=1;
        // }
        // for(int i=0;i<edges.length;i++){
        //     union(edges[i][0],edges[i][1],parent,rank);
        // }

        // // System.out.println(Arrays.toString(parent));
        // // System.out.println(Arrays.toString(rank));

        // ArrayList<Pair> list=new ArrayList<>();
        // int prev = -1;
        // for(int i=0;i<vertices;i++){
        //     if(i==find(parent,i)){
        //         if(prev!=-1){
        //             list.add(new Pair(prev,i));
        //         }
        //         prev=i;
        //     }
        // }
        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        //     System.out.println((list.get(i).i+1)+" "+(list.get(i).j+1));
        // }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edge = sc.nextInt();
        int[][] edges =  new int[edge][2];
        for(int i=0;i<edge;i++){
            edges[i][0]=sc.nextInt()-1;
            edges[i][1]=sc.nextInt()-1;
        }
        graph(vertices, edges);
    }
}
