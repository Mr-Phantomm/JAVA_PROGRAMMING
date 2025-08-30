import javax.sound.sampled.SourceDataLine;
import java.util.*;
public class stques {

    public static void main(String[] args) {
        // int arr[]=new int[]{1,2,1};
        // int k=2;
        // System.out.println(ans(arr,k));
        // int j=9;
        // while(j<10&&j<3){
        //     System.out.println("run"+j);
        //     j++;
        // }
        // Syste
        // String s1="Ishitxaaaaaa";
        // String s2="xyzasd";
        // int i=0;
        // int j=0;
        // StringBuilder str=new StringBuilder("");
        // while(i<s1.length()&&j<s2.length()){
        //     str.append(s1.charAt(i));
        //     str.append(s2.charAt(j));
        //     i++;
        //     j++;
        // }
        // if(i<s1.length())str.append(s1.substring(i, s1.length()));
        // if(j<s2.length())str.append(s2.substring(j, s1.length()));
        // System.out.println(str);
        
        int arr[]=new int[]{1,4};
        int k=3;
        int count =0;
        for(int i=0;i<k;i++){
            Arrays.sort(arr);
            count+=arr[arr.length-1];
            arr[arr.length-1]-=1;
        }
        System.out.println(count);
    }
}