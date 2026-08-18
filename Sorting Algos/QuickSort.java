import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] arr,int i,int j){
        int temp  = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int[] arr,int start,int end){
        int pivot = arr[end];
        int i = 0;
        int j = 0;
        while(j<end){
            if(arr[j]<=pivot){
                swap(arr,i,j);
                i++;
            }
            j++;
        }
        swap(arr,i,end);
        return i;
    }

    public static void QuickSort(int[] arr,int start,int end){
        if(start>=end)return;
        int pivot = partition(arr,start,end);
        QuickSort(arr, start, pivot-1);
        QuickSort(arr, pivot+1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,6,7,42,1,5,7,2,4,8};
        System.out.println(Arrays.toString(arr));
        QuickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
