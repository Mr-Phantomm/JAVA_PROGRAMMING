import java.util.*;
public class test{

    public static void backTrack(int i,ArrayList<String> list,String str,String input){
        if(i==input.length()){
            list.add(new String(str));
            return;
        }
        backTrack(i+1, list, str+input.charAt(i), input);
        backTrack(i+1, list, str+Character.toUpperCase(input.charAt(i)), input);
    }

    public static void main(String[] args) {
        // ArrayList<String> list=new ArrayList<>();
        // backTrack(0, list, "", "abc");
        // System.out.println(list);
        String hname="arun";
        String wname="ryan";
        for(int i=0;i<hname.length();i++){
            if(wname.indexOf(hname.charAt(i))>=0){
                System.out.println(hname.charAt(i));
                break;
            }
        }
    }
}