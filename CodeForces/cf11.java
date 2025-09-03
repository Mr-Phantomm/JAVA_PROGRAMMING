import java.util.Scanner;
public class cf11 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int ans=0;
        for(int i=0;i<a;i++){
            int tempans=0;
            for(int j=0;j<3;j++){
                int x=obj.nextInt();
                tempans+=x;
            }
            if(tempans>=2)ans++;
            
        }
        System.out.println(ans);
    }
}
