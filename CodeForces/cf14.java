import java.util.Scanner;
import java.util.ArrayList;
public class cf14 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int nums=obj.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums;i++){
            int x=obj.nextInt();
            list.add(x);
        }
        list.sort(null);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
