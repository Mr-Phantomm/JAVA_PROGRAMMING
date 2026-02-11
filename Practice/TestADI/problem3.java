import java.util.Scanner;
import java.util.*;
public class problem3 {

    public static class Node{
        int i;
        int j;
        Node(int i,int j){
            this.i=i;
            this.j=j;
        }
    }

    public static int shortestPath(int mat[][],int srcI,int srcJ,int destI,int destJ,int m,int n){
        Queue<Node> queue=new LinkedList<>();
        queue.offer(new Node(srcI,srcJ)); 
        queue.offer(null);
        int steps=0;
        boolean[][] visited=new boolean[m][n];   
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            if(curr==null){
                if(queue.isEmpty())break;
                steps++;
                queue.offer(null);
                continue;
            }
            int i=curr.i;
            int j=curr.j;
            if(i==destI&&j==destJ){
                return steps;
            }
            if(i<0||j<0||i>=m||j>=n||visited[i][j]||mat[i][j]!=1)continue;
            visited[i][j]=true;
            queue.offer(new Node(i+1,j));
            queue.offer(new Node(i-1,j));
            queue.offer(new Node(i,j-1));
            queue.offer(new Node(i,j+1));
        }
        return -1;
    } 

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        int srci=obj.nextInt();
        int srcj=obj.nextInt();
        int desti=obj.nextInt();
        int destj=obj.nextInt();
        
        System.out.println(shortestPath(arr, srci, srcj, desti, destj, m, n));


    }
}
