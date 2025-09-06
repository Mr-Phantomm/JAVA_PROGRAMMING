import java.util.Scanner;
public class cf19 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int prev=1;
        //a=1
        //z=26
        int ans=0;
        // string => zeus
        for(int i=0;i<str.length();i++){
            //e
            int curr=str.charAt(i)-'a'+1; 
            //prev=>26
            //curr=>5
            int clock=(curr-prev+26)%26;
            int anticlock=(prev-curr+26)%26;
            ans+=clock<anticlock?clock:anticlock;
            prev=curr;
        }
        System.out.println(ans);
    }
}
