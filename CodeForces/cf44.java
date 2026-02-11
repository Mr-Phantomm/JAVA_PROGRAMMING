import java.util.Scanner;
public class cf44 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        boolean ans=true;
        char prev='a';
        obj.nextLine();
        for(int i=0;i<n;i++){
            String str=obj.nextLine();
            char nw=str.charAt(0);
            if(nw==prev)ans=false;
            for(int j=1;j<m;j++){
                if(nw!=str.charAt(j))ans=false;
            }
            prev=nw;
        }
        System.out.println(ans?"YES":"NO");
    }
}
