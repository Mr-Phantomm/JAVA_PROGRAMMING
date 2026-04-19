import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;

public class BLabyrinth {
    /*
        DFS Approach not work for shortest Path  
        public static boolean dfs(StringBuilder str , int i,int j,char[][] graph,boolean[][] visited){
            if(i<0||j<0||i>=graph.length||j>=graph[0].length||visited[i][j]||graph[i][j]=='#'){
                return false;
            }
            if(graph[i][j]=='B'){
                return true;
            }
            visited[i][j]=true;
            str.append('L');
            if(dfs(str,i,j-1,graph,visited))return true;
            str.deleteCharAt(str.length()-1);
            str.append('R');
            if(dfs(str,i,j+1,graph,visited))return true;
            str.deleteCharAt(str.length()-1);
            str.append('U');
            if(dfs(str,i-1,j,graph,visited))return true;
            str.deleteCharAt(str.length()-1);
            str.append('D');
            if(dfs(str,i+1,j,graph,visited))return true;
            str.deleteCharAt(str.length()-1);
            return false;
        }
    */
    public static class Pair{
        int i;
        int j;
        String path;
        Pair(int i,int j){
            this.i=i;
            this.j= j ;
        }
        @Override
        public String toString(){
            return i+" "+j+" "+path;
        }
    }

    public static String constructPath(Character[][] path,int i,int j,char[][] graph){
        if(graph[i][j]=='A')return "";
        String ans="";
        if(path[i][j]=='L'){
            ans = constructPath(path, i, j+1, graph);
        }
        if(path[i][j]=='R'){
            ans = constructPath(path, i, j-1, graph);
        }
        if(path[i][j]=='U'){
            ans = constructPath(path, i+1, j, graph);
        }
        if(path[i][j]=='D'){
            ans = constructPath(path, i-1, j, graph);
        }
        return ans+path[i][j];
    }

    public static String bfs(char[][] graph,int i1,int j1){
        boolean[][] visited=new boolean[graph.length][graph[0].length];
        Character[][] path = new Character[graph.length][graph[0].length];
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(i1,j1));
        
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            int i = curr.i;
            int j = curr.j;
            if(i<0||j<0||i>=graph.length||j>=graph[0].length||visited[i][j]||graph[i][j]=='#')continue;
            if(graph[i][j]=='B')return constructPath(path, i, j, graph);
            visited[i][j]=true;
            if(j>=1&&!visited[i][j-1]){
                if(path[i][j-1]==null)path[i][j-1]='L';
                queue.offer(new Pair(i,j-1));
            }
            if(j<graph[0].length-1&&!visited[i][j+1]){
                 if(path[i][j+1]==null)path[i][j+1]='R';
                queue.offer(new Pair(i,j+1));
            }
            if(i>=1&&!visited[i-1][j]){
                if(path[i-1][j]==null)path[i-1][j]='U';
                queue.offer(new Pair(i-1,j));
            }
            if(i<graph.length-1&&!visited[i+1][j]){
                if(path[i+1][j]==null)path[i+1][j]='D';
                queue.offer(new Pair(i+1,j));
            }

            // System.out.println(queue);

        }
        return "";


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] graph = new char[n][m];
        for(int i=0;i<n;i++){
            String temp = sc.nextLine();
            for(int j=0;j<m;j++){
                graph[i][j]=temp.charAt(j);
            }
        }
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(graph[i][j]=='A'){
                    str.append(bfs(graph,i,j));
                    break;
                }
            }
        }
        if(str.length()==0){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        System.out.println(str.length());
        System.out.println(str);
    }
}