import java.util.Scanner;
public class cf18 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        obj.close();
        if(str.length()>0)System.out.println(Character.toUpperCase(str.charAt(0))+(str.substring(1)));
    }
}
