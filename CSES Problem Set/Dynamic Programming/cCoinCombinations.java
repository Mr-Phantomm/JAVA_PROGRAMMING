import java.util.Scanner;

public class cCoinCombinations {

    public static int MOD = (int)Math.pow(10,9)+7;

    public static int recursion(int sum,int[] arr,Integer[] dp){
        if(sum==0)return 1;
        if(sum<0)return 0;
        if(dp[sum]!=null)return dp[sum];
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            ans += recursion(sum-arr[i], arr,dp);
        }
        return dp[sum]=ans%MOD;
    

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(recursion( sum, arr,new Integer[sum+1]));
    }
}
