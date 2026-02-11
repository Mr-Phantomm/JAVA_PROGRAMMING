import java.util.Scanner;
public class cf46 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        char ch=obj.nextLine().charAt(0);
        String str=obj.nextLine();
        String ans="qwertyuiopasdfghjkl;zxcvbnm,./";
        StringBuilder strb=new StringBuilder("");
        int var=(ch=='R'?-1:1);
        for(int i=0;i<str.length();i++){
            strb.append(ans.charAt(ans.indexOf(str.charAt(i))+var));
        }
        System.out.println(strb);

    }
}
