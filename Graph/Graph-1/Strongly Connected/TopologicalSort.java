import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

    public static void dfsUtil(int curr,ArrayList<Integer>[] Graph,Stack<Integer> st,boolean[] visited){
        if(visited[curr])return;
        visited[curr]=true;
        for(int i=0;i<Graph[curr].size();i++){
            int next=Graph[curr].get(i);
            dfsUtil(next, Graph, st, visited);
        }
        st.push(curr);
    }

    public static ArrayList<Integer> DFS(int[][] edges,int vertices){
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] Graph=new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            Graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            Graph[edges[i][0]].add(edges[i][1]);
        }
        boolean[] visited=new boolean[vertices];
        for(int i=0;i<visited.length;i++){

            if(!visited[i])dfsUtil(i, Graph, st,visited );
        }
        while(!st.isEmpty()){
            list.add(st.pop());
        }

        
        return list;
    }
    public static ArrayList<Integer> BFS(int[][] edges,int vertices){
        ArrayList<Integer> list=new ArrayList<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] Graph=new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            Graph[i]=new ArrayList<>();
        }
        int inorder[]=new int[vertices];
        for(int i=0;i<edges.length;i++){
            Graph[edges[i][0]].add(edges[i][1]);
            inorder[edges[i][1]]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<vertices;i++){
            if(inorder[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int curr=queue.poll();
            list.add(curr);
            for(int i=0;i<Graph[curr].size();i++){
                int next=Graph[curr].get(i);
                inorder[next]--;
                if(inorder[next]==0)queue.offer(next);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int vertices=obj.nextInt();
        int edge=obj.nextInt();
        int[][] edges=new int[edge][2];
        for(int i=0;i<edge;i++){
            edges[i][0]=obj.nextInt();
            edges[i][1]=obj.nextInt();
        }
        obj.close();
        System.out.println("DFS-->" + DFS(edges,vertices));
        System.out.println("BFS-->" + BFS(edges,vertices));
    }
}