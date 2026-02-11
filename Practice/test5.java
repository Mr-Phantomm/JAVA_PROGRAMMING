import java.util.*;
public class test5 {
    public static void main(String[] args) {
        String[] item=new String[]{"milk", "chips" ,"banana", "aloo"};
        double[] rates=new double[]{16.2,12.4,23.5,34.6};
        String[] soldItems=new String[]{"milk", "chips"};
        double[] soldRates=new double[]{16.23,12.4};
        Map<String,Double> map=new HashMap<>();
        for(int i=0;i<item.length;i++){
            map.put(item[i],rates[i]);
        }
        int count=0;
        for(int i=0;i<soldItems.length;i++){
            if(map.get(soldItems[i])!=soldRates[i]){
                // System.out.println(soldItems[i]);
                count++;
            }
        }
        System.out.println(count);

    }    
}
