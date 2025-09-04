import java.util.Scanner;
public class cf17 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=obj.nextInt();
        }
        obj.nextLine();
        String str=obj.nextLine();
        int ans=0;
        for(int i=0;i<str.length();i++){
            int x=str.charAt(i)-'0';
            ans+=arr[x-1];
        }
        System.out.println(ans);
    }
}
