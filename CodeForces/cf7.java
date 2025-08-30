import java.util.Scanner;
public class cf7 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int hOF=obj.nextInt();
        int ans=0;
        for(int i=0;i<size;i++){
            int x=obj.nextInt();
            ans+=(x>hOF?2:1);
        }
        System.out.println(ans);
    }
}
