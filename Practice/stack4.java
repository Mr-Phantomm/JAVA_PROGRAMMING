import java.util.*;
public class stack4 {
    public static void main(String args[]){
        Stack<Integer> a= new Stack<>();
        int[] arr=new int[]{6,8,0,1,3};
        int[] newarr=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while((!a.isEmpty())&&(a.peek()<= arr[i])){
                a.pop();
            }
            if(a.isEmpty()){
                newarr[i]=-1;
            }
            else{
                newarr[i]=a.peek();
            }
            a.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(newarr[i]);
        }
    }
}
