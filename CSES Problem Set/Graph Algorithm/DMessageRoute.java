import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class DMessageRoute {

    public static void fillStack(Integer[] parent ,Stack<Integer> st){
        int i = parent.length-1;
        while(i!=0){
            st.push(i);
            i=parent[i];
        }
        st.push(0);
    }

    public static void bfs(ArrayList<Integer>[] graph){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(0);
        boolean[] visited = new boolean[graph.length];
        Integer[] parent = new Integer[graph.length];
        parent[0]=0;
        while(!queue.isEmpty()){
            // System.out.println(queue);
            int curr = queue.poll();
            if(curr==graph.length-1)break;
            for(int i=0;i<graph[curr].size();i++){
                int a = graph[curr].get(i);
                if(parent[curr]==a)continue;
                if(!visited[a]){
                    visited[a]=true;
                    parent[a]=curr;
                    queue.offer(a);
                }
                
            }
        }
        // System.out.println(Arrays.toString(parent));
        if(parent[graph.length-1]==null){
            System.out.println("IMPOSSIBLE");
            return;
        }
        Stack<Integer> st =  new Stack<>();
        fillStack(parent, st);
        System.out.println(st.size());
        while(!st.isEmpty()){
            System.out.print((st.pop()+1)+" ");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        
        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges;i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            graph[u].add(v);
            graph[v].add(u);
        }

        bfs(graph);

    }
}
