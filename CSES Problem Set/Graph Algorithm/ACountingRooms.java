import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ACountingRooms {

    public static class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
        @Override
        public String toString(){
            return "("+i+" "+j+")";
        }
    }

    public static void bfs(char[][] graph,boolean[][] visited,int i,int j){
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(i,j));
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            int i1 = curr.i;
            int j1=curr.j;
            if(i1<0||j1<0||i1>=graph.length||j1>=graph[0].length||visited[i1][j1]||graph[i1][j1]=='#')continue;
            // System.out.println(curr);
            visited[i1][j1]=true;
            queue.offer(new Pair(i1+1,j1));
            queue.offer(new Pair(i1-1,j1));
            queue.offer(new Pair(i1,j1+1));
            queue.offer(new Pair(i1,j1-1));
            // System.out.println(queue);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] arr= new char[m][n];
        sc.nextLine();
        for(int i=0;i<m;i++){
            String temp = sc.nextLine();
            for(int j=0;j<n;j++){
                arr[i][j] = temp.charAt(j);
            }
        }
        boolean[][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]=='.'&&!visited[i][j]){
                        bfs(arr,visited,i,j);
                        // System.out.println("\n\n\n\n\n\n\n");
                        count++;                  
                }
            }
        }
        System.out.println(count);
        
        
    }
}
