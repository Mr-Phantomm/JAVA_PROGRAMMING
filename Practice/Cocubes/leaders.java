import java.util.ArrayList;
import java.util.List;

public class leaders {

    public static void printLeaders(int[] arr,int n){
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(max<arr[i]){
                list.add(0,arr[i]);
                max=arr[i];
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{16, 19, 4, 3, 8, 3};
        int n = arr.length;
        printLeaders(arr,n);
    }
    
}