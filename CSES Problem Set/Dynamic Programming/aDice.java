import java.util.*;
public class aDice {
    public static int waysToCreate(int n){
        if(n<0)return 0;
        if(n==0)return 1;
        int ways =0;
        ways+=waysToCreate(n-1);
        ways+=waysToCreate(n-2);
        ways+=waysToCreate(n-3);
        ways+=waysToCreate(n-4);
        ways+=waysToCreate(n-5);
        ways+=waysToCreate(n-6);
        return ways;
    }

    public static int waysToCreateMemoMap(int n,Map<String,Integer> dp){
        if(n<0)return 0;
        if(n==0)return 1;
        // 10
        String dpString = ""+n;
        // "10 100 2000" 
        if(!dp.containsKey(dpString))return dp.get(dpString);
        int ways =0;
        ways+=waysToCreateMemoMap(n-1,dp);
        ways+=waysToCreateMemoMap(n-2,dp);
        ways+=waysToCreateMemoMap(n-3,dp);
        ways+=waysToCreateMemoMap(n-4,dp);
        ways+=waysToCreateMemoMap(n-5,dp);
        ways+=waysToCreateMemoMap(n-6,dp);
        dp.put(dpString,ways);
        return ways;
    }

    public static int waysToCreateIntegerArray(int n,Integer[] dp){
        if(n<0)return 0;
        if(n==0)return 1;
        if(dp[n]!=null)return dp[n];
        int ways =0;
        ways+=waysToCreateIntegerArray(n-1,dp);
        ways+=waysToCreateIntegerArray(n-2,dp);
        ways+=waysToCreateIntegerArray(n-3,dp);
        ways+=waysToCreateIntegerArray(n-4,dp);
        ways+=waysToCreateIntegerArray(n-5,dp);
        ways+=waysToCreateIntegerArray(n-6,dp);
        return dp[n]=ways;
    }

    public static int tabuLATION(int n){
        int[] waysToCreate = new int[n+1];
        waysToCreate[0]=1;
        for(int i=1;i<=n;i++){
            // 2
            for(int j=1;j<=6;j++){
                
                // 2-2 = 0
                if(i-j<0)break;
                // dp[2] += dp[1];
                waysToCreate[i]+=waysToCreate[i-j];
            }
        }
        return waysToCreate[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Recursion -> "+waysToCreate(n));
        System.out.println("MemoMap -> "+waysToCreateMemoMap(n,new HashMap<>()));
        System.out.println("Memo in Integer arrya -> "+waysToCreateIntegerArray(n,new Integer[n+1]));
        System.out.println("Tabulation -> "+tabuLATION(n));
    }


}
