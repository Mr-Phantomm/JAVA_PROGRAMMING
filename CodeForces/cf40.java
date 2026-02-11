import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class cf40 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        Queue<Integer> q3=new LinkedList<>();
        for(int i=0;i<x;i++){
            int num=obj.nextInt();
            if(num==1){
                q1.offer(i+1);
            }
            else if(num==2){
                q2.offer(i+1);
            }
            else{
                q3.offer(i+1);
            }
        }
        int min = Math.min(q1.size(),Math.min(q2.size(),q3.size()));
        System.out.println(min);
        while(!q1.isEmpty()&&!q2.isEmpty()&&!q3.isEmpty()){
            System.out.println(q1.poll()+" "+q2.poll()+" "+q3.poll());
        }
        
}}
