import java.util.Scanner;

public class cf56 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int testCases=obj.nextInt();
        for(int i=0;i<testCases;i++){
            int fuels=obj.nextInt();
            int dest=obj.nextInt();
            int max=obj.nextInt();
            int prev=max;
            for(int j=0;j<fuels-1;j++){
                int next=obj.nextInt();
                max=Math.max(next-prev,max);
                prev=next;
            }
            max=Math.max(2*(dest-prev),max);
            System.out.println(max);
        }
    }
}
