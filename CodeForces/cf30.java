import java.util.Scanner;
public class cf30 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        boolean t= false;
        obj.nextLine();
        for(int i=0;i<n;i++){
            String str=obj.nextLine();
            str=str.trim();
            String[] strs=str.split(" ");
            if(Integer.parseInt(strs[1])>=2400&&Integer.parseInt(strs[2])>Integer.parseInt(strs[1])){
                t=true;
                
            }
        }
        if(t){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
