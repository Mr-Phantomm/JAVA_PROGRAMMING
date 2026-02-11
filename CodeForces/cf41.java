import java.util.Scanner;
public class cf41 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.nextLine();
        String str=obj.nextLine();
        int ans=0;
        int firstI=0;
        for(int i=0;i<str.length();i++){
            if(firstI==1&&str.charAt(i)=='I'){
                ans=0;
                break;
            }
            else if(str.charAt(i)=='F')continue;
            else if(str.charAt(i)=='A'){
                if(firstI==0){ans++;}
                else{
                    continue;
                }
            }
            else{
                firstI++;
                ans=1;
            }
        }
        System.out.println(ans);
    }
    
}
