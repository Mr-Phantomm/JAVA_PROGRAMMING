public class sort {
    public static void selection(int[] arr){
        int i=0;
        
        while(i<arr.length-1){
            int j=i;
            for(int k=i;k<arr.length-1;k++){
                j=(arr[k]<arr[j]?k:j);
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
    }
    public static void insertion(int[] arr){
        int a=0;
       
        
    }
    public static void show(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int binary(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        int m=(s+e)/2;
        for(int i=s;i<=e;i++){
            m=(s+e)/2;
            if(arr[m]==k){
                return m;
            }
            if(arr[m]>k){
                e=m-1;
                continue;
            }
            if(arr[m]<k){
                s=m+1;
                continue;
            }
            
            
        }
        return -1;
    }
    public static int firstocc(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        int mid;
        int ans=-1;
        while(s<=e){
            mid=s+((e-s)/2);
            if(arr[mid]==k){
                ans=mid;
                e=mid-1;
                
            }
            if(arr[mid]>k){
                e=mid-1;
            }
            if(arr[mid]<k){
                s=mid+1;
            }
        }
        return ans;
    }
    public static int[] mergesort(int[] arr,int s,int e){
        
    }
    public static void main(String args[]){
        int[] arr={1,2,3,3,4,5,31};
        // selection(arr);
        // show(arr);
        // int k=3;
        // int a=firstocc(arr,k);
        System.out.print(a);
    }
}
