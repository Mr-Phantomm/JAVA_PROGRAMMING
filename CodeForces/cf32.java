import java.util.Scanner;
public class cf32 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int cal=x;
        cal*=(int)x/2;     
        cal+=(x%2==0)?0:(x/2)+1;
        System.out.println(cal);
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print("C"+(j+1<x?".":""));
                j++;
            }
            System.out.println();
            i++;
            if(i>=x)break;
            for(int j=0;j<x;j++){
                System.out.print("."+(j+1<x?"C":""));
                j++;
            }
            System.out.println();
        }
    }
}
