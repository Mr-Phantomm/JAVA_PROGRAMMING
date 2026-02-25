import java.util.PriorityQueue;
import java.util.Scanner;
public class cf57 {

    public static class Node{
        int freq;
        int value;
        Node(int freq,int value){
            this.freq=freq;
            this.value=value;
        }
    }

    public static void main(String args[]){
        PriorityQueue<Node> pq=new PriorityQueue<>((Node a,Node b)->{
            if(a.value>b.value)return -1;
            if(a.value<b.value)return 1;
            return 0;
        });
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int containers=obj.nextInt();
        for(int i=0;i<containers;i++){
            int a=obj.nextInt();
            int b=obj.nextInt();
            pq.offer(new Node(a,b));
        }
        int ans=0;
        while(N>0&&!pq.isEmpty()){
            Node curr=pq.poll();
            if(N>=curr.freq){
                ans+=curr.freq*curr.value;
                N-=curr.freq;
            }
            else{
                ans+=N*curr.value;
                break;
            }
        }
        System.out.println(ans);
        

    }
}
