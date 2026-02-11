import java.util.Scanner;

public class problem5 {

    public static String isValidBST(int n,int[] traversal){
        
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] traversal=new int[n];
        for(int i=0;i<n;i++){
            traversal[i]=obj.nextInt();
        }
        System.out.println(isValidBST(n, traversal))
    }
}
