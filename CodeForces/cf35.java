import java.util.Scanner;
public class cf35 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int i=0;i<t;i++){
            int n=obj.nextInt();
            int time=obj.nextInt();
            int points=0;
            int currtime=0;
            int currpos=0;
            for(int j=0;j<n;j++){
                int requiretime=obj.nextInt();
                int requirePosition=obj.nextInt();
                int timeForMov=requiretime-currtime;
                if(currpos==requirePosition){
                    if(timeForMov%2==0){
                        points+=timeForMov;
                    }
                    else{
                        points+=timeForMov-1;
                    }
                }
                else{
                    if(timeForMov%2==0){
                        points+=timeForMov-1;
                    }
                    else{
                        points+=timeForMov;
                    }
                    currpos=requirePosition;
                }
                // System.out.println("points"+points);
                currtime=requiretime;
            }
            points+=time-currtime;
            System.out.println(points);
        }
    }
    
}
