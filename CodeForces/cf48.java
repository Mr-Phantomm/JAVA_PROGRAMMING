import java.util.Scanner;
import java.util.PriorityQueue;

public class cf48 {
    public static class Object{
        int key;
        int value;
        Object(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Object> pq=new PriorityQueue<>((o1,o2)->{
            if(o1.value>o2.value)return -1;
            else if(o1.value<o2.value)return 1;
            return 0;
        }); 
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        for(int i=0;i<m;i++){
            int x=obj.nextInt();
            int y=obj.nextInt();
            pq.offer(new Object(x,y));
        }
        int ans=0;
        while(n>0&&!pq.isEmpty()){
            Object asd=pq.poll();
            if(n==asd.key){
                ans+=asd.key*asd.value;
                n=0;
            }
            else if(n>asd.key){
                ans+=asd.key*asd.value;
                n=n-asd.key;

            }
            else{
                ans+=n*asd.value;
                n=0;
            }
        }
        System.out.println(ans);
    }
}