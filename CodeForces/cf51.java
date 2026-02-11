import java.util.Scanner;
public class cf51 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        long n=obj.nextLong();
        long m=obj.nextLong();
        long ans=0;
        if(n%2==0){
            if(m<=n/2){
                ans=2*m-1;
            }
            else{
                m-=n/2;
                ans=2*m;
            }
        }
        else{
            if(m<=n/2+1){
                ans+=2*m-1;
            }
            else{
                m-=n/2+1;
                ans=2*m;
            }
        }
        System.out.println(ans);
    }
}
