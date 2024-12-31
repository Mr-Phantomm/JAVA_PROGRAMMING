import java.net.SocketPermission;
import java.util.*;
public class three {
    static String check(int a){
        if(a%2==0){
            return "Even number";
        }
        else{
            return "odd number";
        }
    }
    public static int cnt =0;
    static void ab(){
       int n;
       
        cnt++;
        Scanner obj= new Scanner(System.in);
        n=obj.nextInt();
        if(n>0){
            System.out.println(n);
        }
        else if(n<0){
            if(cnt<3){
            System.out.println("Wrong enter again");
            ab();
        }
            else{
                System.out.println("bye bye");
            }
        }
    }
    public static void main(String args[]){
        // int a;
        // Scanner obj= new Scanner(System.in);
        // a=obj.nextInt();

        // System.out.println(check(a));
        ab();
    }
}
