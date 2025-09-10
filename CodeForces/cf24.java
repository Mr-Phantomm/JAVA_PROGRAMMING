import java.util.Scanner;
public class cf24 {
    public static int gcd(int a,int b){
        while(b%a==0){
            int temp=a;

        }
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int max=0;
        int x=obj.nextInt();
        max=max>x?max:x;
        x=obj.nextInt();
        max=max>x?max:x;
        int numOfincoming=6-max+1;
        int totalNumber=6;
        if(numOfincoming%3==0){
            numOfincoming=numOfincoming/3;
            totalNumber/=3;
        }
        if(numOfincoming%2==0){
            numOfincoming/=2;
            totalNumber/=2;
        }
        System.out.println(numOfincoming+"/"+totalNumber);
    }
}