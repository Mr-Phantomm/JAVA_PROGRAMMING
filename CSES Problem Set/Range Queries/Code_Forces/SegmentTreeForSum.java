import java.util.Arrays;
import java.util.Scanner;

public class SegmentTreeForSum{

    public static void build(int i,long[] arr,long[] tree,int left ,int right){
        if(left==right){
            tree[i]=arr[left];
            return;
        }
        int mid=(right-left)/2+left;
        build(2*i+1,arr,tree,left,mid);
        build(2*i+2,arr,tree,mid+1,right);
        tree[i]=tree[2*i+1]+tree[2*i+2];
    }

    public static void update(int i,int updateIndex,int updateValue,long[] tree,int left,int right){
        if(left==updateIndex&&updateIndex==right){
            tree[i]=updateValue;
            return;
        }
        if(right<updateIndex||left>updateIndex)return;
        int mid = (right-left)/2+left;
        if(updateIndex <= mid) update(2*i+1,updateIndex,updateValue,tree,left,mid);
        else update(2*i+2,updateIndex,updateValue,tree,mid+1,right);
        tree[i]=tree[2*i+1]+tree[2*i+2];
    }

    public static long sum(int i,int qLeft,int qRight,int left,int right,long[] tree){
        if(qRight<left||qLeft>right)return 0;
        if(left>=qLeft&&right<=qRight)return tree[i];
        int mid = (right-left)/2+left;
        long leftAns = sum(2*i+1,qLeft,qRight,left,mid,tree);
        long rightAns = sum(2*i+2,qLeft,qRight,mid+1,right,tree);
        return leftAns+rightAns; 
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        int query = sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextLong();
        }
        long[] tree = new long[4*size];
        build(0,arr,tree,0,size-1);
        // System.out.println(Arrays.toString(tree));
        for(int j=0;j<query;j++){
            int q = sc.nextInt();
            if(q==1){
                int i = sc.nextInt();
                int v = sc.nextInt();
                update(0,i,v,tree,0,size-1);
                // System.out.println(Arrays.toString(tree));
            }
            else{
                int l = sc.nextInt();
                int r = sc.nextInt()-1;
                System.out.println(sum(0,l,r,0,size-1,tree));
            }
        }
    }
}