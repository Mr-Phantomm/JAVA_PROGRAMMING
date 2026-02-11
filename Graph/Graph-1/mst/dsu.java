public class dsu {

    public static int n=7;
    public static int[] par=new int[n];
    public static int[] rank=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }

    public static int find(int x){
        if(x==par[x])return par[x];
        return find(par[x]);
    }

    public static void union(int u,int v){
        int parU=find(u);
        int parV=find(v);

        if(rank[parU]==rank[parV]){
            par[parU]=parV;
            rank[parV]++;
        }
        else if(rank[parU]<rank[parV]){
            par[parU]=parV;
        }
        else{
            par[parV]=parU;
        }
    }


    public static void main(String[] args) {
        init();
        union(1,2);
        union(0,1);
        
            
    }

}
