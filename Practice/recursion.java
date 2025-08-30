public class recursion {
    public static void printarr(int[] arr,int i){
        if (i<0) {
            return;
        }
        printarr(arr,i-1);
        System.out.println(arr[i]);
    }
    static int maxy=Integer.MIN_VALUE;
    public static int max(int[] arr,int i ){
        if(i>arr.length-1)return Integer.MIN_VALUE;
        // else{
        //     return arr[i];
            // 
            max(arr,i+1);
            int value=arr[i];
        maxy=maxy>value?maxy:value;
        return maxy;

    }
    public static void main(String args[]){
        int[] arr=new int[]{1,2,3,4,5};
        // printarr(arr,arr.length-1);
        System.out.println(max(arr,0));
    }
}
