import java.util.*;
public class cf3 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n,m;
        int x;
        x=obj.nextInt();
        obj.nextLine();
        for(int i=0;i<x;i++){
            int counter=0;
            n=obj.nextInt();
            m=obj.nextInt();
            obj.nextLine();
            int[] arr=new int[n];
            int[] arr2=new int[m];
            for(int k=0;k<n;k++){
                arr[k]=obj.nextInt();
            }
            obj.nextLine();
            for(int j=0;j<m;j++){
                arr2[j]=obj.nextInt();
            }
            obj.nextLine();
            for(int k=0;k<n;k++){
                arr[k]=arr2[0]-arr[k];
            }
            for(int k=0;k<n-1;k++){
                if(arr[k]>arr[k+1]){
                    counter++;
                    break;
                }

            }
            if(counter==1){
                System.out.println("NO");
            }
            else if(counter==0){
                System.out.println("YES");
            }
        }
    }
}
