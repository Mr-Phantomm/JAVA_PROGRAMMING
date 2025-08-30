import java.util.*;
public class rain {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        
        int[] maxleft=new int[n];
        int[] maxright=new int[n];
        maxleft[0]=arr[0];
        for(int i=1;i<n;i++){
            maxleft[i]=(maxleft[i-1]>arr[i]?maxleft[i-1]:arr[i]);
        }
        maxright[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--){
            maxright[j]=(maxright[j+1]>arr[j]?maxright[j+1]:arr[j]);
        }
        int min;
        int total=0;
        for(int k=0;k<n;k++){
            min=(maxleft[k]<maxright[k]?maxleft[k]:maxright[k]);
            total=total+(min-arr[k]);

        }
        System.out.println(total);
    }
}
    