import java.util.*;
public class five {
    public static void sortColors(int[] nums) {
       
        int k = 0; 
        int f = nums.length - 1; 
        int i = 0; 

        while (i <= f) {
            if (nums[i] == 0) {
              
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
              
                int temp = nums[i];
                nums[i] = nums[f];
                nums[f] = temp;
                f--;
            }
        }
    
    }
    public static void main(String args[]){
        int n;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        sortColors(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
