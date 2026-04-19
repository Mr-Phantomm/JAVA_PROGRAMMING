import java.util.Scanner;

public class cf60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num  = sc.nextInt();
        int ans = 0;
        while(n>0){
            if(num%n==0){
                int a = num / n;
                if(a>n)break;
                if(a == n){
                    ans++;
                }else{
                    ans+=2;
                }
                // System.out.println(n+" "+a);/
            }
            n--;
        }
        System.out.println(ans);
    }
}
