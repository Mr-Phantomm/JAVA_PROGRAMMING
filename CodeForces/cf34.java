import java.util.Scanner;

public class cf34 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        for(int i=0;i<x;i++){
            int z=obj.nextInt();
            int n=obj.nextInt();
            if(n%2==0){
                System.out.println(0);
            }
            else{
                System.out.println(z);
            }
        }
    }
}
