import java.util.Scanner;

public class SegementTreeInfosysProblemSetEasy {

    public static void build(int[] arr,int[] tree,int left,int right,int i){
        if(left==right){
            tree[i]=arr[i];
            return;
        }
        int mid=(right-left)/2+left;
        build(arr,tree,left,mid,2*i+1);
        build(arr,tree,mid+1,right,2*i+2);
        tree[i]=tree[2*i+1]+tree[2*i+2];
    }

    public static void query(int[] tree,int left,int right,int qLeft ,int qRight,int i){
        if()
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    }

}