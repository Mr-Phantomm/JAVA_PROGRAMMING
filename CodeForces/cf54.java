import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cf54 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ans=0;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            boolean shiHai=true;
            for(int j=0;j<n;j++){
                int x=obj.nextInt();
                if(x==1||x==3){
                    shiHai=false;
                }
            }
            if(shiHai){
                list.add(i);
                ans++;
            }
        }
        System.out.println(ans);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
