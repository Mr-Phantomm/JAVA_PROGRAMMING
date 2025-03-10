import java.util.*;
public class ishitastaudent {
    public static void count(int n){
        if(n==1){
            return;
        }
        

        count(n-1);
        System.out.println(n);

    }
    public static int jump(int n){
        System.out.println("calling"+" "+n);
        if(n==0||n==1){
            return 1;
        }
        return jump(n-1)+jump(n-2);
    }
    public static int maxy(int[] arr,int max,int i){
        if(i>arr.length-1){return max;}
       max=max>arr[i]?max:arr[i];
        return  maxy(arr,max,i+1);   
    }
    public static Boolean check(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>=arr[i+1]){
            return false;
        }
        return check(arr,++i);
        
    }
    public static int binary(int[] arr, int start ,int end,int target){
        int mid=start+(end-start)/2;
        if(start>end){
           System.out.println("not found");
           return -1;
        }
        if(arr[mid]==target){
            // System.out.println("found at "+ mid);
            return mid;
        }
        else if(arr[mid]<target){
            return binary(arr,mid+1,end,target);
        }
        else{
           return binary(arr,start,mid-1,target);
        }
        
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
        // int n=10;
        // count(n);
        // System.out.println(jump(4));
        int[] arr=new int[]{2,6,7,9,12,11};
        // int max=Integer.MIN_VALUE;
        // System.out.println(maxy(arr,max,0));
        // System.out.println(check(arr,0));
        System.out.println(binary(arr,0,arr.length-1,11));

    }
}