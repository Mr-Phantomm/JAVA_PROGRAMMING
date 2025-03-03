import java.util.*;
public class ishitastaudent {
    public static void count(int n){
        if(n==1){
            return;
        }
        

        count(n-1);
        System.out.println(n);

    }
    public static void main(String args[]){
        // int[] arr={1,2,-3,-1,-2,-3};
        // int curr=0;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(curr<0){
        //         curr=0;
        //     }
        //     curr+=arr[i];
        //     max=(max>curr?max:curr);
        // }
        // System.out.println(max);
        int n=10;
        count(n);
    }
}