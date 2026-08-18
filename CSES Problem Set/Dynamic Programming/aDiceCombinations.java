import java.util.Scanner;

public class aDiceCombinations {
    public static int MOD = (int)Math.pow(10,9)+7;

    public static int recursion(int i){
        if(i<0)return 0;
        if(i==0)return 1;
        int ans = recursion(i-1)+recursion(i-2)+recursion(i-3)+recursion(i-4)+recursion(i-5)+recursion(i-6);
        return ans;
    }

    public static long dpMemo(int i,Long[] dp){
        if(i<0)return 0;
        if(i==0)return 1;
        if(dp[i]!=null)return dp[i];
        long ans = dpMemo(i-1,dp)+dpMemo(i-2,dp)+dpMemo(i-3,dp)+dpMemo(i-4,dp)+dpMemo(i-5,dp)+dpMemo(i-6,dp);
        return dp[i]=ans;
    }

    public static long dpTabu(int n){
        long[] dp = new long[n+1];
        dp[0]=1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(j+i>n)break;
                dp[j+i]=(dp[j+i]+dp[i])%MOD;
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // System.out.println(dpMemo(n,new Long[n+1])%MOD);
        System.out.println(dpTabu(n)%MOD);
    }    
}
