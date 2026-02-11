import java.util.Scanner;

public class problem4 {

    static int minScore(int mat[][],int m,int n){
        
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println(minScore(arr, m, n));

    }
}
