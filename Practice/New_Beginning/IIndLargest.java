public class IIndLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,3,5,6,3,4};
        int max = Integer.MIN_VALUE;
        int IIndMax =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                IIndMax = max;
                max=arr[i];
            }
        } 
        System.out.println(IIndMax);
    }
}
