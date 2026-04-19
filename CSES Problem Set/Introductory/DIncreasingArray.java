import java.util.Scanner;

public class DIncreasingArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        long numberOfMoves = 0;
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num<max){
                numberOfMoves += max-num;
            }
            else{
                max=num;
            }

        } 
        sc.close();
        System.out.println(numberOfMoves);
    }
}