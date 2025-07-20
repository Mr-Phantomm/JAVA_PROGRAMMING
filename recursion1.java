public class recursion1 {

    public static int fib(int x){
        if(x==0)return 0;
        if(x==1)return 1;
        int num= fib(x-1)+fib(x-2);
        
    }

    public static void main(String[] args) {
        int x=10;
        System.out.println(fib(5));
    }
}
