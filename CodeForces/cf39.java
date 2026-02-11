import java.util.Scanner;
public class cf39 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int arr[]=new int[x];
        int totalSum=0;
        for(int i=0;i<x;i++){
            arr[i]=obj.nextInt();
            totalSum+=arr[i];

        }
        int s=obj.nextInt();
        int t=obj.nextInt();
        int dis=0;
        int curr=s-1;
        while(curr+1!=t){
            dis+=arr[curr];
            curr++;
            curr=curr%x;
        }
        System.out.println(dis<totalSum-dis?dis:totalSum-dis);
    }
}
