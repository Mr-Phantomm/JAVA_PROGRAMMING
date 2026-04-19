import java.util.Scanner;

public class cf59{

    public static int max(int[] arr,int index){
        int prev = 0;
        int curr = index==1?2:1;
        int max = Integer.MIN_VALUE;
        while(curr<arr.length){
            // System.out.println(prev+" "+curr);
            if(prev==index)prev++;
            if(curr!=index){
                max=Math.max(max,arr[curr]-arr[prev]);
                prev++;
            }
            curr++;
        }
        return max;
        
        

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int m = Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            // System.out.println("Comparing for "+i);
            m=Math.min(max(arr,i),m);
            // System.out.println(m+"\n\n\n\n\n");
        }
        
        System.out.println(m);

    }
}