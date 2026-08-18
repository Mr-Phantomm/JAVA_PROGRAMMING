import java.util.Scanner;

public class dRemovingDigits {

    public static int remove(int n){
        if(n==0)return 0;
        if(n<0)return Integer.MAX_VALUE;

        int copy = n;
        int ans = Integer.MAX_VALUE;
        while(copy>0){
            int digit = copy%10;
            int temp = remove(n-digit);
            if(temp != Integer.MAX_VALUE){
                ans = Math.min(temp+1,ans);
            }
            copy/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(remove(n));
    }
}
