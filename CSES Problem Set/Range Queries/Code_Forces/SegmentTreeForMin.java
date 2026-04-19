import java.util.Scanner;

public class SegmentTreeForMin {

    public static void build(long[] arr,long[] tree,int left,int right,int i){
        if(left==right){
            tree[i]=arr[left];
            return;
        }
        int mid = (right-left)/2+left;
        build(arr,tree,left,mid,2*i+1);
        build(arr,tree,mid+1,right,2*i+2);
        tree[i]=Math.min(tree[2*i+1],tree[2*i+2]);
    }
    public static void update(long[] tree,int left,int right,int updateIndex,int updateValue,int i){
        if(left==updateIndex&&right==updateIndex){
            tree[i]=updateValue;
            return;
        }
        if(left>updateIndex||right<updateIndex)return;
        int mid = (right-left)/2+left;
        if(updateIndex<=mid) update(tree,left,mid,updateIndex,updateValue,2*i+1);
        else update(tree,mid+1,right,updateIndex,updateValue,2*i+2);
        tree[i]=Math.min(tree[2*i+1],tree[2*i+2]);
    }

    public static long query(long[] tree,int left,int right,int qLeft,int qRight,int index){
        if(right<qLeft||left>qRight){
            return Integer.MAX_VALUE;
        }
        if(right<=qRight&&left>=qLeft)return tree[index];
        int mid = (right-left)/2+left;
        long leftMin = query(tree,left,mid,qLeft,qRight,2*index+1);
        long rightMin = query(tree,mid+1,right,qLeft,qRight,2*index+2);
        return Math.min(leftMin,rightMin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int queries = sc.nextInt();
        long[] arr = new long[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextLong();
        }
        long[] tree = new long[4*size];
        build(arr,tree,0,size-1,0);
        for(int j=0;j<queries;j++){
            int q = sc.nextInt();
            if(q==1){
                int i=sc.nextInt();
                int v=sc.nextInt();
                update(tree,0,size-1,i,v,0);
            }
            else{
                int l = sc.nextInt();
                int r = sc.nextInt()-1;
                System.out.println(query(tree,0,size-1,l,r,0));
            }
        }
        
    }
}
