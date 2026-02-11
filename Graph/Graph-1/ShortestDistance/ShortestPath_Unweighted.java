package ShortestDistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ShortestPath_Unweighted {

    public static String ShortestPath(ArrayList<ArrayList<Integer>> graph,int src,int dest){
        StringBuilder str=new StringBuilder("");

        int[] parent=new int[graph.size()];
        Arrays.fill(parent,-1);
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(src);
        boolean[] visited=new boolean[graph.size()];
        while(!queue.isEmpty()){
            int curr=queue.poll();
            if(visited[curr])continue;
            visited[curr]=true;
            for(int i=0;i<graph.get(curr).size();i++){
                
                int next=graph.get(curr).get(i);
                if(next==parent[curr])continue;
                if(parent[next]==-1){
                    parent[next]=curr;
                    queue.offer(next);
                }
            }
        }


        Stack<Integer> st=new Stack<>();
        
        while(dest!=-1){
            st.push(dest);
            dest=parent[dest];
        }
        
        while(!st.isEmpty()){
            str.append(st.pop());
            if(!st.isEmpty()){
                str.append("=>");
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of Vertices");
        int v=obj.nextInt();
        System.out.println("Enter the number of Edges");
        int e=obj.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int src=obj.nextInt();
            int dest=obj.nextInt();
            list.get(src).add(dest);
            list.get(dest).add(src);
        }

        int src=obj.nextInt();
        int dest=obj.nextInt();

        System.out.println(ShortestPath(list,src,dest));

    }
}
