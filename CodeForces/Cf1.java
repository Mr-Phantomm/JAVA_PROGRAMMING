import java.util.*;
public class Cf1 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
             int a,b,c,d;
            a=obj.nextInt();
            b=obj.nextInt();
            c=obj.nextInt();
            d=obj.nextInt();
            int count=0;
            int total=b+c+d;
            count=(a/total)*3;
            a=a%total;
            while(a>0){
                if(a>0){
                    a-=b;
                    count++;
                }
                if(a>0){
                    a-=c;
                    count++;
                }
                if(a>0){
                    a-=d;
                    count++;
                }

            }
            System.out.println(count);

        }
    }
}
