import java.util.Scanner;
public class cf10 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<3;j++){
                int x=obj.nextInt();
                temp+=x==1?1:0;
            }
            if(temp>=2)ans++;
        }
        System.out.println(ans);
    }
}
