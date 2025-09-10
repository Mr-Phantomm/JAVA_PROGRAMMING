import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class cf28 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        Set<Character> set=new HashSet<>();
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)!=' '&&str.charAt(i)!=','){
                set.add(str.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}
