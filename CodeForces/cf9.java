import java.util.*;
public class cf9 {
   public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();
    int year=0;
    while(a<b){
        a*=3;
        b*=2;
        year++;
    }
    System.out.println(year);

   } 
}
