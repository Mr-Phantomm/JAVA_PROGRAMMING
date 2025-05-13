import java.util.*;
public class ishitastudent3 {
    public static void main(String args[]){
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        int[] arr=new int[]{(int)set};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
