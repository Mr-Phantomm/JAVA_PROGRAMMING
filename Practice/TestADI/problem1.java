import java.util.Arrays;
import java.util.Scanner;

public class problem1{

    public static String sol(int n,int[] arr){
        String[] str=new String[n];
        for(int i=0;i<arr.length;i++){
            str[i]=Integer.toString(arr[i]);
        }
        Arrays.sort(str,(a,b)->{
            if(Integer.parseInt(a+b)>Integer.parseInt(b+a))return -1;
            return 1;
        });

        StringBuilder str2=new StringBuilder("");
        for(int i=0;i<str.length;i++){
            str2.append(str[i]);
        }
        return str2.toString();
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n =obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println(sol(n,arr));
    }
}