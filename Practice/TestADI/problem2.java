import java.util.Scanner;

public class problem2 {

    static long maxPoints(int arr[],int N,int K){
        long curr = 0;
        long max = 0;
        for(int i=0;i<N;i++){
            if(arr[i]>K){
                curr=0;
                continue;
            }
            else{
                curr+=K-arr[i];
                max=Math.max(curr,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();
        System.out.println(maxPoints(arr, n, k));
    }
}
