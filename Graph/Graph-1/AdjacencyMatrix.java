import java.util.Scanner;

public class AdjacencyMatrix{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int v=obj.nextInt();
        int e=obj.nextInt();
        int[][] graph=new int[v][v];
        for(int i=0;i<e;i++){
            int u=obj.nextInt();
            int d=obj.nextInt();
            graph[u][d]++;
            graph[d][u]++;
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}