import java.util.Scanner;
public class cf50 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int zero=arr[0];
        int last=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            int min=0;
            int left=i-1>=0?arr[i]-arr[i-1]:Integer.MAX_VALUE;
            int right=i+1<arr.length?arr[i+1]-arr[i]:Integer.MAX_VALUE;
            System.out.print((left<right?left:right)+" ");
            System.out.print((last-arr[i]>arr[i]-zero?(last-arr[i]):(arr[i]-zero)));
            System.out.println();
        }
    }
}
