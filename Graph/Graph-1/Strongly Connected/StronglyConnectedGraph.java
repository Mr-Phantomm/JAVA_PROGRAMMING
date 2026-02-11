import java.util.*;

class StronglyConnectedGraph {

    public static void DFS(boolean[] visited,int curr,ArrayList<Integer>[] Graph){
        if(visited[curr])return;
        visited[curr]=true;
        for(int i=0;i<Graph[curr].size();i++){
            int next=Graph[curr].get(i);
            DFS(visited, next, Graph);
        }
    }

    public static boolean checkStronglyConnected(int vertices,int[][] edges){

        ArrayList<Integer>[] Graph=new ArrayList[vertices];
        
        for(int i=0;i<vertices;i++){
            Graph[i]=new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            Graph[src].add(dest);
        }

        boolean[] visited=new boolean[vertices];

        DFS(visited,0, Graph);
        
        for(int i=0;i<visited.length;i++){
            if(!visited[i])return false;
        }
        
        ArrayList<Integer>[] Reversed=new ArrayList[vertices];
        
        for(int i=0;i<vertices;i++){
            Reversed[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            Reversed[dest].add(src);
        }
        visited = new boolean[vertices];
        DFS(visited,0, Reversed);
        
        for(int i=0;i<visited.length;i++){
            if(!visited[i])return false;
        }



        return true;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int vertices=sc.nextInt();
        int edge=sc.nextInt();
        int[][] edges=new int[edge][2];
        for(int i=0;i<edge;i++){
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }
        System.out.println(checkStronglyConnected(vertices,edges));
    }
}