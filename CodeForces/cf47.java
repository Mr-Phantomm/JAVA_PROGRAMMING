import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class cf47 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine();
        String str2=obj.nextLine();
        String str3=obj.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        boolean check=true;
        if(str3.length()!=str1.length()+str2.length()){
            check=false;
        }
        else{
            for(int i=0;i<str1.length();i++){
                if(!map.containsKey(str1.charAt(i)))map.put(str1.charAt(i),0);
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }
            for(int i=0;i<str2.length();i++){
                if(!map.containsKey(str2.charAt(i)))map.put(str2.charAt(i),0);
                map.put(str2.charAt(i),map.get(str2.charAt(i))+1);
            }
            for(int i=0;i<str3.length();i++){
                if(!map.containsKey(str3.charAt(i))){
                check=false;break;}
                map.put(str3.charAt(i),map.get(str3.charAt(i))-1);
            }
            for(char key : map.keySet()){
                if(map.get(key)!=0){
                    check=false;
                    break;
                }
            }
        }
        System.out.println((check?"YES":"NO"));
    }
}
