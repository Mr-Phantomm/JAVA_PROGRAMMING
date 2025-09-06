import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class cf20 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        Map<Integer,Integer> host=new HashMap<>();
        Map<Integer,Integer> guest=new HashMap<>();


        for(int i=0;i<num;i++){


            int hostnum=obj.nextInt();
            int guestnum=obj.nextInt();


            if(!host.containsKey(hostnum))host.put(hostnum,0);
            if(!guest.containsKey(guestnum))guest.put(guestnum,0);
            
            
            host.put(hostnum,host.get(hostnum)+1);
            guest.put(guestnum,guest.get(guestnum)+1);


        }

        System.out.println(host);
        System.out.println(guest);
        int ans=0;
        // 100 42
        // 42 100
        // 5 42
        // 100 5
        // {100=2, 5=1, 42=1}
        // {100=1, 5=1, 42=2}
        for(int key : guest.keySet()){
            if(host.containsKey(key))
            ans+=host.get(key)*guest.get(key);
        }


        System.out.println(ans);
    }
}
