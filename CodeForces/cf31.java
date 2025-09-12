import java.util.Scanner;
public class cf31 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int[] arr=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=obj.nextInt();
        }
        x=obj.nextInt();
        for(int i=0;i<x;i++){
            int row=obj.nextInt()-1;
            int pos=obj.nextInt();
            if(row-1>=0){
                arr[row-1]+=pos-1;
            }
            if(row+1<arr.length){
                arr[row+1]+=arr[row]-pos;
            }
            arr[row]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
