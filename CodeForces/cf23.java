import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class cf23 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        Map<Integer,Integer> map= new HashMap<>();
        int total=0;
        for(int i=0;i<n;i++){
            int x=obj.nextInt();
            total+=x;
            if(!map.containsKey(x))map.put(x,0);
            map.put(x,map.get(x)+1);
        }
        int ans=0;
        for(int key : map.keySet()){
            int ifwechoose=total-key;
            if(ifwechoose%2==0){
                ans+=map.get(key);
            }

        }
        System.out.println(ans);
    }
}
