import java.util.Scanner;
public class cf15 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        obj.nextLine();
        String a=obj.nextLine();
        obj.close();
        int ans=0;
        for(int i=0;i<size-1;i++){
            if(a.charAt(i)==a.charAt(i+1)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
