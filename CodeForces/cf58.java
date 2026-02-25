import java.util.Scanner;

public class cf58 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int dollarsPaid=0;
        int currPole=0;
        int power=0;
        int numberOfPoles=obj.nextInt();
        for(int i=0;i<numberOfPoles;i++){
            int next=obj.nextInt();
            if(currPole>next){
                power+=currPole-next;
                currPole=next;
            }
            if(currPole<=next){
                int diff=next-currPole;
                if(power>=diff){
                    power-=diff;
                    currPole=next;
                }
                else{
                    diff-=power;
                    dollarsPaid+=diff;
                    power=0;
                    currPole=next;
                }
            }
        }
        System.out.println(dollarsPaid);
    }
}
