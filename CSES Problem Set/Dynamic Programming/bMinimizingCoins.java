import java.util.Scanner;

public class bMinimizingCoins {

    public static int recursion(int[] arr,int index,int totalValue,Integer[][] dp){
        if(totalValue==0)return 0;
        if(index>=arr.length||totalValue<0)return Integer.MAX_VALUE;
        if(dp[index][totalValue]!=null)return dp[index][totalValue];
        int taken = recursion(arr, index, totalValue-arr[index],dp);
        int nottaken = recursion(arr,index+1,totalValue,dp);
        if(taken!=Integer.MAX_VALUE)taken+=1;
        return dp[index][totalValue]=Math.min(taken,nottaken);
    }

    public static int tabulation(int[] arr,int totalValue){
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalValue = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans = recursion(arr,0,totalValue,new Integer[n+1][totalValue+1]);

        if(ans==Integer.MAX_VALUE){
            System.out.println(-1);
            return;
        }

        System.out.println(ans);

    }
}


