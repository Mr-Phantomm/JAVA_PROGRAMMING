import java.util.Scanner;
public class cf61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        b=b%n;
        // System.out.println(b);
        int ans = 0 ;
        if(b==0){
            ans = a;
        }
        else if(b>0){
            if(a+b<=n){
                ans=a+b;
            }else{
                
            }
            
            if(ans==0)ans=1;
        }
        else{
            if(Math.abs(b)<=a) ans = a+b;
            else ans = (a+n+b)%(n);
            if(ans==0)ans=n;
        }
        System.out.println(ans);
    }
}
