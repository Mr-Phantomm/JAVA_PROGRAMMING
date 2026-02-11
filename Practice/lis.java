import java.util.Arrays;
import java.util.Scanner;

public class lis{

    public static int longestIncreasingSubstring(int[] arr,int i,int prev,int[][] dp){

        if(i==arr.length)return 0;
        if(dp[i][prev+1]!=-1)return dp[i][prev+1];
        
        
        int notTake=longestIncreasingSubstring(arr, i+1, prev, dp);
        int take=0;
        if(prev==-1||arr[i]>arr[prev]){
            take=1+longestIncreasingSubstring(arr, i+1, i, dp);
        }
        System.out.println("We Found that on "+i+" we have a optiomal subsequence of length "+Math.max(take,notTake)+"When prev is "+prev);
        return dp[i][prev+1]=Math.max(take,notTake);
    }

    public static void main(String[] args) {
        // 10 9 2 5 3 7 101 18
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        int[][] dp=new int[n+1][n+2];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(longestIncreasingSubstring(arr, 0, -1, dp));
    }

}