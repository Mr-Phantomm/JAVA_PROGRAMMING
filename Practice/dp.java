import java.util.*;
public class dp {

    public static int recursion(int n,int[] dp){

        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        int sum = recursion(n-1,dp);
        System.out.println("On "+n+" Expected Value That we Have "+ recursion(n-1,dp));
        return dp[n]=n+ sum;
    }

    

    public static void main(String[] args) {
        int[] dp=new int[6];
        Arrays.fill(dp,-1);
        recursion(5,dp);
    }
}
