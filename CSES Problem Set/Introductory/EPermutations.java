import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EPermutations {

    public static boolean permut(int prev,int max,int min,Set<Integer> curr,boolean[] visited){
        if(curr.size() == max)return true;
        int min1=min;
        System.out.println(curr+" "+min);
        boolean skipped = false;
        for(int i=min+1;i<=max;i++){
            if(visited[i])continue;
            if(prev+1==i||prev-1==i){
                skipped=true;
                continue;
            }
            visited[i]=true;
            curr.add(i);
            if(skipped == false) {
                min = i;
            }
            if(permut(i,max,min,curr,visited))return true;
            curr.remove(i);
            min=min1;
            visited[i]=false;
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans=permut(-1,n,0,set,new boolean[n+1]);
        if(ans==false){
            System.out.println("NO SOLUTION");
        }
        else{
            for(int key : set){
                System.out.print(key+" ");
            }
        }
        sc.close();
    }
}
