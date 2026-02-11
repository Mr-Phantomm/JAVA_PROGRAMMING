import java.util.Scanner;
public class bs {
     public static int startIndex(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=(e-s)/2+s;
            if(arr[mid]<k){
                s=mid+1;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }
            else{
                e=mid;
            }
        }
        return arr[e]==k?e:-1;
    }
    public static int ans(int[] arr,int k){
        int s=startIndex(arr,k);
        if(s==-1){
            return -1;
        }
        int SI=s;
       int  e=arr.length-1;
        while(s<=e){
            int mid=(e-s)/2+s;
            if(arr[mid]<k){
                s=mid+1;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }
            else{
                s=mid;
            }
        }
        return e-s+1;
    }
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int testCases=obj.nextInt();
        for(int j=0;j<testCases;j++){
            int n=obj.nextInt();
            int k=obj.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=obj.nextInt();   
            }
            System.out.println(ans(arr,k));
            
        }
        // StringBuilder str=new StringBuilder("");
        // Write your code here
    }
}
