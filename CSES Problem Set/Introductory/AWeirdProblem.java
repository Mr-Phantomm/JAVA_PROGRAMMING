import java.util.Scanner;
public class AWeirdProblem {

    public static void weirdAlgo(long n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        else if(n%2==0){
            System.out.print(n+" ");
            weirdAlgo(n/2);
        }
        else{
            System.out.print(n+" ");
            weirdAlgo(n*3+1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        weirdAlgo(n);
        sc.close();
    }
    
}