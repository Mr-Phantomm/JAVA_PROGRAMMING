import java.util.Arrays;
import java.util.Scanner;

public class Sample1v2 {

    public static int minExcercise(int[] arr,int i,int turns,int Energy){
        if(i==arr.length)return 0;
        if(turns==2){
            return minExcercise(arr, i+1, 0,Energy);
        }
        int taken = 0;
        if(Energy>=arr[i]){
            taken = 1 + minExcercise(arr, i, turns+1,Energy-arr[i]);
        }
        int notTaken = minExcercise(arr, i+1,0, Energy);
        return Math.min(taken,notTaken);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Energy = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        
    }
}
