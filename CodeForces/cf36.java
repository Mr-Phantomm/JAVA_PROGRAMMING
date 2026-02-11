import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class cf36 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int i=0;i<t;i++){
            int numberOfFields=obj.nextInt();
            long evensum=0;
            ArrayList<Integer> list=new ArrayList<>();
            int oddcount=0;
            int minOdd=0;
            for(int j=0;j<numberOfFields;j++){
                int x=obj.nextInt();
                if(x%2==0){
                    evensum+=x;
                }
                else{
                    oddcount++;
                    list.add(x);
                    
                }
            }
            if(oddcount==0){
                System.out.println(0);
                continue;
            }
            Collections.sort(list);
            int j=list.size()-1;
            while(j>=list.size()/2){
                evensum+=list.get(j);
                j--;
            }
            System.out.println(evensum);
        }
    }
}
