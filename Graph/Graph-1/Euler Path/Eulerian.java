import java.util.*;
public class Eulerian {

    public static boolean checkSemiEulerian(int v,int[][] edges){
        int[] degree=new int[v];
        for(int i=0;i<edges.length;i++){
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;

        }

        int NumberOfOdds=0;
        for(int i=0;i<degree.length;i++){
            if(degree[i]%2==1)NumberOfOdds++;
        }

        return NumberOfOdds==2&&isConnected(v, edges);

    }

    public static int DFS(int v,boolean[] visited,ArrayList<Integer>[] Graph,int parent){
        if(visited[v])return 0;
        visited[v]=true;
        int count=0;
        for(int i=0;i<Graph[v].size();i++){
            int next=Graph[v].get(i);
            if(parent==next)continue;
            count+=DFS(next,visited,Graph,v);
        }
        return count+1;
        
    }

    public static boolean isConnected(int v,int[][] edges){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] adj=new ArrayList[v];
        
        for(int i=0;i<v;i++){
            adj[i]=new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }

        int start=-1;
        
        for(int i=0;i<v;i++){
            if(!adj[i].isEmpty()){
                start=i;
                break;
            }
        }

        if(start==-1)return true;

        boolean[] visited=new boolean[v];

        boolean foundNonZero=false;

        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                int numberOfEdgesIntheComponent=DFS(i,visited,adj,i);
                if(numberOfEdgesIntheComponent==1)continue;
                if(!foundNonZero){
                    foundNonZero=true;
                }
                else{
                    return false;
                }
            }
        }
        return true;



    }

    public static boolean CheckEulerian(int v,int[][] edges){
        int[] degree=new int[v];
        
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            degree[src]++;
            degree[dest]++;
        }

        boolean isEulerian=true;

        for(int i=0;i<degree.length;i++){
            if(degree[i]%2!=0){
                isEulerian=false;
                break;
            }
        }

        return isEulerian&&isConnected(v, edges);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int v=obj.nextInt();
        int e=obj.nextInt();
        int[][] edges=new int[e][2];
        
        for(int i=0;i<edges.length;i++){
            edges[i][0]=obj.nextInt();
            edges[i][1]=obj.nextInt();
        }

        System.out.println("Graph  Eulerian : "+CheckEulerian(v,edges));
        System.out.println("Graph Semi-Eulerian : "+checkSemiEulerian(v,edges));
        System.out.println("Graph Non Eulerian : "+(!CheckEulerian(v, edges)&&!checkSemiEulerian(v, edges)));
    }
}
