import java.util.Scanner;
public class cf22 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String t=obj.nextLine();
        int sindex=0;
        int tindex=0;
        while(tindex<t.length()){
            if(s.charAt(sindex)==t.charAt(tindex)){
                sindex++;
            }
            tindex++;
        }
        System.out.println(sindex+1);
    }
}
