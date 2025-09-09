import java.util.Scanner;
public class cf25 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int smallest=Integer.MAX_VALUE;
        int secSmallest=Integer.MAX_VALUE;
        for(int i=0;i<x;i++){
            int num=obj.nextInt();
            if(num<smallest){
                secSmallest=smallest;
                smallest=num;
            }
            else if (num>smallest){
                secSmallest=num<secSmallest?num:secSmallest;
            }

        }
        if(secSmallest!=Integer.MAX_VALUE)System.out.println(secSmallest);
        else{
            System.out.println("NO");
        }
    }
}
