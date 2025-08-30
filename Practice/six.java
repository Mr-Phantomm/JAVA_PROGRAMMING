import java.util.*;
import java.lang.*;
public class six {
    
    public static void palindrome(String str){
        int s=0;
        int e=str.length()-1;
        boolean x=true;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                x=false;
                break;
            }
            s++;
            e--;
        }
        if(x){
            System.out.println(str + " Is palindrome");
        }
        else{
            System.out.println(str+" Is not a palindrome");
        }
    }
    public static float getshord(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                x++;
            }
            if(str.charAt(i)=='S'){
                x--;
            }
            if(str.charAt(i)=='W'){
                y--;
            }
            if(str.charAt(i)=='E'){
                y++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    static int s;
    public static void main(String args[]){
        // String str;
        Scanner obj=new Scanner(System.in);
        // str=obj.nextLine();
        // palindrome(str);
        // System.out.println(getshord(str));
        // String str2="hello i am arun";
        // StringBuilder str=new StringBuilder("");
        // for(char ch='a';ch<'z';ch++){
        //     str2.append(ch);
        // }
        // str.append(Character.toUpperCase(str2.charAt(0)));
        // for(int i=1;i<str2.length();i++){
        //     if(str2.charAt(i) == ' '){
        //         str.append(" ");
        //         str.append(Character.toUpperCase(str2.charAt(i+1)));
        //         i++;
        //     }
        //     else{
        //         str.append(str2.charAt(i));
        //     }
        // }
        // System.out.println(str);
        // String str="aaabbcccd";
        // StringBuilder str2=new StringBuilder(""); 
        // int count=1;
        // for(int i=0;i<str.length()-1;i++){
        //     if(str.charAt(i)==str.charAt(i+1)){
        //         count++;
        //     }
        //     else{
        //         str2.append(str.charAt(i));
        //         str2.append(count);
        //         count=1;
        //     }
        // }
        // str2.append(str.charAt(str.length()-1));
        // str2.append(count);
        // System.out.println(str2);
        // String str1="race";
        // String str2="care";
        // int check=0;
        // for(int i=0;i<str1.length();i++){
        //     // for(int j=0;j<str2.length();j++){
        //     //     if(str1.charAt(i)==str2.charAt(j)){
        //     //         str1.charAt(i)='';
        //     //         str2.charAt(j)='';

        //     //     }
        //     // }
        //     check+=str1.charAt(i);
        // }
        // for(int i=0;i<str2.length();i++){
        //     check-=str2.charAt(i);
        // }
        // System.out.println(check);
        // if(check!=0){
        //     System.out.println("not anagrams");
        // }
        // else{
        //     System.out.println("anagrams");
        // }
        String str="my Name is Arun";
        StringBuilder su= new StringBuilder("");
        
        int e;
        int count =0;
        
        for(int i=0;i<str.length();i++){
            if(count==0&&str.charAt(i)!=' '){
                count++;
                s=i;
            }
            if(count==1&&(str.charAt(i)==' '||str.length()-1==i)){
                e=i;
                for(int j=s;j<=e;j++){
                    su.append(str.charAt(i));
                }
                count--;
            }
            
        }
        System.out.println(su);


    }
}
