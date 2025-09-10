import java.util.Scanner;
public class cf27 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String num=obj.nextLine();
        int numOfluck=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='7'||num.charAt(i)=='4')numOfluck++;
        }
        if(numOfluck==4||numOfluck==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
