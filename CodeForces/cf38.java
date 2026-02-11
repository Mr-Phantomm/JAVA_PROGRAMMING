import java.util.Scanner;
public class cf38 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.nextLine();
        String str=obj.nextLine();
        if(x<26){
            System.out.println("NO");
            return;
        }
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[Character.toLowerCase(str.charAt(i))-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
