import java.util.Scanner;

public class BMissingNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        long n = sc.nextInt();
        long ans = 0; 
        for(long i=0;i<n-1;i++){
            ans ^= sc.nextInt();
            ans ^= i+1;
        }
        ans ^= n;
        System.out.println(ans);
        sc.close();
    }
}
