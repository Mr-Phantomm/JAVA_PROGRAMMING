import java.util.Scanner;
public class CRepetitions{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        sc.close();
        int l=0;
        int r=0;
        int max=0;
        while(r<str.length()){
            char charAtL=str.charAt(l);
            char charAtR=str.charAt(r);
            if(charAtL!=charAtR){
                l=r;
            }
            max=Math.max(r-l+1,max);
            r++;
        }
        System.out.println(max);

    }
}