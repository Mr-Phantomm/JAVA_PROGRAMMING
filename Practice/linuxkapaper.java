import java.util.*;
public class linuxkapaper {
    public static void main(String[] args) {
        int a=313;
        int original=a;
        int reversed=0;
        while(a>0){
            int digit=a%10;
            reversed=reversed*10+digit;
            a/=10;
        }
        if(reversed==original)System.out.println(true);
        else{
            System.out.println(false);
        }
    }
}
