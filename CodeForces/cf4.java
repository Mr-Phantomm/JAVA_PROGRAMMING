// import java.util.*;
// public class cf4 {
//     public static void main(String args[]){
//         Scanner obj=new Scanner(System.in);
//         int n;
//         n=obj.nextInt();
//         obj.nextLine();
//         for(int i=0;i<n;i++){
//             String str=obj.nextLine();
//             obj.nextLine();
//             int x=str.length()-1;
//             for(int j=0;j<str.length-1;j++){
//                 if(str.charAt(j)==str.charAt(j+1)){
//                     x-=2;
                    
//                 }
//             }
//         }
//     }
// }
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int end = nums.length - 1;
        int totalDigits = nums.length;

        for (int i = 0; i < totalDigits - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] != '_') {
                for (int j = i + 1; j < end; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[end] = '_';
                end--;
                totalDigits--;
                i--;
            }
        }
        return totalDigits;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = sol.removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
