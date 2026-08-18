import java.util.Arrays;

public class MergeSort {

    public static void merge(int arr[],int start,int mid,int end){
        int[] temp = new int[end-start+1];
        int Point = 0;
        int Point1 = start;
        int Point2 = mid+1;
        while(Point1<=mid&&Point2<=end){
            int ele1 = arr[Point1];
            int ele2 = arr[Point2];
            if(ele1<ele2){
                temp[Point++]=ele1;
                Point1++;
            }
            else{
                temp[Point++]=ele2;
                Point2++;
            }
        }
        
        while(Point1<=mid){
            temp[Point++]=arr[Point1++];
        }
        while(Point2<=end){
            temp[Point++]=arr[Point2++];
        }
         
        for(int i=start;i<=end;i++){
            arr[i]=temp[i-start];
        }
    }


    public static void mergeSort(int[] arr,int start,int end){
        if(start>=end)return;
        
        int mid = (end-start)/2+start;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,mid,end);

    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,6,4,3,2,5,2,1,4,6,2};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }   
}
