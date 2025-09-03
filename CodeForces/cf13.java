import java.util.Scanner;
import java.lang.Math;
public class cf13 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        // int n=0;
        int ans=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int n=obj.nextInt();
                if(n==1){
                    ans=Math.abs(3-i)+Math.abs(3-j);
                    break;
                }
            }
        }
        System.out.println(+ans);
    }
}
