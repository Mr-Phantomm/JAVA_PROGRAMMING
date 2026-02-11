import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class krushkal {

    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        
        }
    }
    public static int find(int x,int[] par){
        if(x==par[x]){
            return x;
        }
        return par[x]=find(par[x],par);
    }

    public static void union(int x,int y,int[] par,int[] rank){
        int parX=find(x,par);
        int parY=find(y,par);

        if(rank[parX]==rank[parY]){
            par[parY]=parX;
            rank[parX]++;
        }
        else if(rank[parX]<rank[parY]){
            par[parX]=parY;
        }
        else{
            par[parY]=parX;
        }
    }

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int v=obj.nextInt();
        int e=obj.nextInt();
        ArrayList<Edge> list=new ArrayList<>();
        for(int i=0;i<e;i++){
            int src=obj.nextInt();
            int dest=obj.nextInt();
            int wt=obj.nextInt();
            list.add(new Edge(src,dest,wt));
        }        
        
        Collections.sort(list,(a,b)->{
            if(a.wt<b.wt){
                return -1;
            }
            if(a.wt>b.wt)return 1;
            return 0;
        });
        int[] par=new int[v];
        int[] rank=new int[v];
        for(int i=0;i<v;i++){
            par[i]=i;
        }   


        int cost=0;

        for(int i=0;i<list.size();i++){
            int src=list.get(i).src;
            int dest=list.get(i).dest;
            int wt=list.get(i).wt;
            if(find(src,par)!=find(dest,par)){
                cost+=wt;
                union(src,dest,par,rank);
            }
        }
        System.out.println(cost);



    }
    
}
