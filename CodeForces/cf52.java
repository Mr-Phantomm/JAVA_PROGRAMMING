import java.util.Scanner;
public class cf52 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        boolean ans=true;
        while(x>0&&y>0){
            ans=!ans;
            x=x-1;
            y=y-1;
        }
        System.out.println(!ans?"Akshat":"Malvika");
    }
}
