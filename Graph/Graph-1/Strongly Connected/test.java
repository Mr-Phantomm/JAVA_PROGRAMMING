public class test {
    public static void recursion(int n){
        if(n>5)return;
        System.out.println(n);
        recursion(n+1);
    }
    public static void main(String[] args) {
        recursion(0);
    }
}
