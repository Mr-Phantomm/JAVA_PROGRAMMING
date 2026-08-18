import java.util.Arrays;

public class CountSortV2 {

    public static char[] countSort(char[] arr){
        int[] aux = new int[256];
        for(int i=0;i<arr.length;i++){
            int curr = (int)arr[i];
            aux[curr]++;
        }
        for(int i=0;i<255;i++){
            aux[i+1]+=aux[i];
        }
        
        char[] ans = new char[arr.length];

      for(int i=arr.length-1;i>=0;i--){
            int curr = (int)arr[i];
            ans[aux[curr]-1] = arr[i];
            aux[curr]--;
        }
        return ans;
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'a','b','z','c','a','d','1','2','3'};
        System.out.println(Arrays.toString(arr));
        char[] ans = countSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
