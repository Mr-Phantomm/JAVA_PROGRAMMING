public class Ques2 {
    public static int maxDiff(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i])continue;
                max=Math.max(max,arr[j]-arr[i]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7, 9, 5, 6, 3, 2};
        // int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        System.out.println(maxDiff(arr));
    }
}
