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
        int e=0;
        for(int i=0;i<e)
    }
    public static void show(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] arr={2,1,3,4,5};
        selection(arr);
        show(arr);
    }
}
