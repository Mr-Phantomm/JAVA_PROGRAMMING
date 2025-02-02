import java.util.*;
public class chunk1{
    static int count=1;
    public static void print(float x){
        System.out.println(x);
    }
    static public int fact(int n){
        if(n<=1){
            return count;
        }
        count*=n;
        --n;
        return fact(n);
    }
    
    public static float bin(int x,int y){
        
        return fact(x)/(fact(y)*fact(x-y));
    }
    public static void main(String args[]){
   
        print(fact(5));
        print(bin(5,2));
     
    }
}