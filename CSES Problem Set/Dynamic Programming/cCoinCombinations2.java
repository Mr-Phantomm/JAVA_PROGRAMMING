import java.util.Scanner;

public class cCoinCombinations2 {

    public static int MOD = (int)Math.pow(10,9)+7;

    public static int combinations(int sum,int[] arr,int i){
        if(sum==0)return 1;
        if(sum<0||i>=arr.length)return 0;
        return (combinations(sum-arr[i], arr, i)+combinations(sum, arr, i+1))%MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(combinations(sum,arr,0));


    }
}
