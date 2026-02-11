import java.util.Scanner;
public class cf43 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int k=obj.nextInt();
        int l=obj.nextInt();
        int m=obj.nextInt();
        int n=obj.nextInt();
        int d=obj.nextInt();
        boolean contains=false;
        int count=0;
        for(int i=1;i<=d;i++){
            contains=false;
            if(i%k==0)contains=true;
            else if(i%l==0)contains=true;
            else if(i%m==0)contains=true;
            else if(i%n==0)contains=true;
            if(contains)count++;
        }
        System.out.println(count);
    }
}
