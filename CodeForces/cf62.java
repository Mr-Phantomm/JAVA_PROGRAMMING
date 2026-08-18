import java.util.Scanner;

public class cf62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt()-1;
        int b = sc.nextInt();
        b%=n;
        
        if(b<0){
            b = (-b)*(n-1);
            b %= n;
        }
        a=((a+b)%n)+1;

        System.out.println(a);
        


    }
}
