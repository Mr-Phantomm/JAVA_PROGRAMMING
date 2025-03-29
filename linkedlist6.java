public class linkedlist6 {
    public static void merge(int[] arr,int s,int m,int e){
        int[] temp=new int[e-s+1];
        int var1=s;
        int var2=m+1;
        int start=0;
        while(var1<=m&&var2<=e){
            if(arr[var1]<arr[var2]){
                temp[start++]=arr[var1++];
            }
            else{
                temp[start++]=arr[var2++];
          
            }
        }
        while(var1<=m){
            temp[start++]=arr[var1++];
        }
        while(var2<=e){
            temp[start++]=arr[var2++];
        }
        for(int i=0;i<temp.length;i++){
            arr[s+i]=temp[i];
        }

    }
    public static void mergesort(int[] arr,int s,int e){
        if(s==e){
            return ;
        }
        int mid=s+(e-s)/2;
        mergesort(arr, s, mid);
        mergesort(arr, mid+1, e);
        merge(arr,s,mid,e);
    }
    public static void main(String args[]){
        int arr[]=new int[]{5,4,3,2,1,0};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}