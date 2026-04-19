public class CountSort {
    public static void main(String[] args) {
        char[] arr =new char[]{'a','b','c','v','f','d'};
        int[] count = new int[256];
        char[] aux = new char[arr.length];
        for(int i=0;i<arr.length;i++){
            count[arr[i]+1]++;
        }
        for(int i=1;i<256;i++){
            count[i]=count[i]+count[i-1];
        }
        for(int i=0;i<arr.length;i++){
            aux[count[arr[i]]++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=aux[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}