public class mergesort {
    public static void merge(int[] arr,int s,int m,int e){
        int n1=s;
        int n2=m+1;
        int[] temp=new int[e-s+1];
        int start=0;
        while(n1<=m&&n2<=e){
            if(arr[n1]<arr[n2]){
                temp[start++]=arr[n1++];
            }
            if(arr[n1]>arr[n2]){
                temp[start++]=arr[n2++];
            }

        }
        while(n1<=m){
            temp[start++]=arr[n1++];
        }
        while(n2<=e){
            temp[start++]=arr[n2++];
        }
        for(int i=0;i<temp.length;i++){
            arr[s+i]=temp[i];
        }

    }
    public static void mergesort(int[] arr,int s,int e){
        if(s==e){
            return;
        }
        int m=s+(e-s)/2;
        mergesort(arr,s,m);
        mergesort(arr,m+1,e);
        merge(arr,s,m,e);

    }
    public static void main(String args[]){
        int[] arr=new int[]{9,8,7,6,5,4,3,2,1};
        mergesort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
