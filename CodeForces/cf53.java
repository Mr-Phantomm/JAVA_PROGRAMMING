import java.util.Scanner;
public class cf53 {
    public static int socks(int available,int daysPast,int newSockAfter){
        if(available==0)return 0;
        int ans=available;
        available=available+daysPast;
        return ans+socks(available/newSockAfter,available%newSockAfter,newSockAfter);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        System.out.println(socks(n,0,m));
        
    }
}
