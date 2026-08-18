import java.util.Arrays;
import java.util.Scanner;

public class cf63{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int left = 0;
        int right = 0;
        int currentTimeFrame = 0;
        int currentSpace = n;
        boolean currentWatching = false;
        while(left<=right){
            
        }

        sc.close();
    }
}