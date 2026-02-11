public class bubbleSort {
    public static int Sort(int[] arr){
        int numberOfSwaps = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    numberOfSwaps++;
                }
            }
        }
        return numberOfSwaps;
    }

    public static int OptimisedSort(int[] arr){
        int numberOfSwaps = 0;
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                    numberOfSwaps++;
                }
            }
            if(!swapped)break;
        }
        return numberOfSwaps;
    }


    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr=new int[]{5,3,8,4,2};
        int[] arr2=new int[]{5,3,8,4,2};
        int numberOfSwapsInBubbleSort=Sort(arr);
        int numberOfSwapsInOptimisedBubbleSort=Sort(arr2);

        printArr(arr);
        System.out.println("Number of Swaps in Bubble Sort is "+ numberOfSwapsInBubbleSort);
        printArr(arr2);
        System.out.println("Number of Swaps in Optimised Bubble Sort is "+ numberOfSwapsInOptimisedBubbleSort);
    }
}
