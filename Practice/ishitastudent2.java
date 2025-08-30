import java.util.*;
import java.lang.Math;
public class ishitastudent2 {
public static void sequence(String str,String output,int i){
    if(i>=str.length()){
        System.out.println(output);
        return;
    }
    sequence(str,output,i+1);
    sequence(str,output+str.charAt(i),i+1);


}
    public static int shortest(String str,int i,int x,int y){
        if(i>str.length()-1){
            return (int)Math.pow((x*x)+(y*y),0.5);

        }
        if(str.charAt(i)=='N'){
            x=x+1;
        }
        if(str.charAt(i)=='S'){
            x=x-1;
        }
        if(str.charAt(i)=='W'){
            y=y-1;
        }
        if(str.charAt(i)=='E'){
            y=y+1;
        }
        return shortest(str,i+1,x,y);
    }
    public static String compress(String str,StringBuilder x,int i,int count){
        if(i>=str.length()){
            x.append(str.charAt(i-1));
            x.append(count);
            return x.toString();
        }
        else if(str.charAt(i)!=str.charAt(i-1)){
            x.append(str.charAt(i-1));
            x.append(count);
            count=1;
            return compress(str, x, i+1, count);
        }
        
        else{
            return compress(str, x, i+1, count+1);
        }


    }
    public static void main(String args[]){
        String str=new String("aaabbbbcccc");
        StringBuilder str2=new StringBuilder("");
        System.out.println(compress(str,str2,1,1));
        // String str="abc";
        // String output="";
        // sequence(str,output,0);
        // Scanner obj=new Scanner(System.in);
        // String ishita = "WNEENESENNN";
        // System.out.println(shortest(ishita, 0, 0, 0));
        // String[] str= new String[]{"Mango","Banana","Apple"};
        // int max=0;
        //     for(int i=1;i<str.length;i++){
        //         if(str[max].compareTo(str[i])<0){
        //             max=i;
        //         }
                
        //     }
        // System.out.println(str[max]);
        // String str=" i am arun";
        // StringBuilder str2=new StringBuilder("");
        // int e=(str.charAt(0)==' '?0:1);
        // if(e==1){
        //     str2.append(Character.toUpperCase(str.charAt(0)));

        // }
        // for(int i=e;i<str.length();i++){
        //     if(str.charAt(i)== ' '){
        //         str2.append(str.charAt(i));
        //         i++;
        //         str2.append(Character.toUpperCase(str.charAt(i)));
        //         continue;
        //     }
        //     str2.append(str.charAt(i));

        // }
        // System.out.println(str2);


    }
}
