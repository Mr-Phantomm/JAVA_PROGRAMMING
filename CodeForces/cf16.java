import java.util.Scanner;
public class cf16 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int numberOFevents=obj.nextInt();
        int policeOfficerTillNow=0;
        int unattendedCrime=0;
        for(int i =0;i<numberOFevents;i++){
            int num=obj.nextInt();
            if(num<0&&policeOfficerTillNow==0){
                unattendedCrime+=(-1*num);
            }
            else policeOfficerTillNow+=num;
        }
        System.out.println(unattendedCrime);
    }
}
