import java.util.Scanner;
public class cf21 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int price=obj.nextInt();
        int last=obj.nextInt();
        int x=1;
        int ans=price;
        while(ans%10!=0&&ans%10!=last){
            x++;
            ans=price*x;
        }
        System.out.println(x);
        
    }
}
