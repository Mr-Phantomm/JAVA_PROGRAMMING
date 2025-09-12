import java.util.Scanner;
public class cf33 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int max=0;
        int x=obj.nextInt();
        boolean goingUp=true;
        int compare=0;
        int prev=Integer.MIN_VALUE;
        int equal=1;
        for(int i=0;i<x;i++){
            int curr=obj.nextInt();
            if(goingUp){
                if(curr>prev){
                    compare++;
                    equal=1;
                }
                else if(curr==prev){
                    equal++;
                    compare++;
                }
                else {
                    equal=1;
                    goingUp=false;
                    compare++;
                }
                // System.out.println("increased at"+curr+"and Equal "+equal);
            }
            else{
                if(curr>prev){
                    compare=1+equal;
                    goingUp=true;
                }
                else if(curr==prev){
                    equal++;
                    compare++;
                }
                else{
                    // System.out.println("increased at"+curr+"and Equal "+equal);
                    equal=1;
                    compare++;
                }
            }
            prev=curr;
            if(max<compare){
                // System.out.println("Compared"+compare);

            }
            max=max>compare?max:compare;
        }
        System.out.println(max);
    }
}
