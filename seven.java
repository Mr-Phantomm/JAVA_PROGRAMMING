import java.util.*;
public class seven {
    public static void ithbit(int n,int k){
        // System.out.println((n&(1<<k))/(int)Math.pow(2,k));
        if((n&(1<<k))/(int)Math.pow(2,k)==0){
            n=n|(1<<k);
            System.out.println(n);
        }
        else{
            System.out.println("already 1");
        }
    }
    public static void main(String args[]){
        int n;
        Scanner obj = new Scanner(System.in);
        // StringBuilder str= new StringBuilder("");
        // str.append(Character.toUpperCase('a'));
        // System.out.println(str);
        n=obj.nextInt();
        // if((n&1)==1){
        //     System.out.println("odd");
        // }
        // else{
        //     System.out.println("even");
        // }
        int k=obj.nextInt();
        
        ithbit(n,k);
    }
}
