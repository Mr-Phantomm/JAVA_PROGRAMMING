import java.util.*;
public class cf2 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n;
        n=obj.nextInt();
        obj.nextLine();
        for(int i=0;i<n;i++){
            String w=obj.nextLine();
            String newx=w.substring(0,w.length()-2)+"i";
            System.out.println(newx);
        }
    }
}
