public class coinproblem {
    public static int min(int[] arr,int target){
        if(target==0){
            return 0;
        }
        else if(target<0){
            return Integer.MAX_VALUE;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            System.out.println("SUBTRACTING "+arr[i]+"from "+target);
           int  ans=min(arr,target-arr[i]);
           System.out.println("Steps till now "+ans+"AND Comparing it to mini "+mini);
           if(ans!=Integer.MAX_VALUE) mini=mini<ans+1?mini:ans+1;
        }
        System.out.println("what's value of mini till now "+mini);
        return mini;
    
    }

    public static void main(String args[]){
        int[] arr=new int[]{1,2};
        System.out.println(min(arr,2));
    }
}
// public class coinproblem {
//     public static int min(int[] arr,int target,int check,int count,int i){
//         if(target==0){
//             check=check<count?check:count;
//             return check;
//         }
//         else if(target<0){
//             check=check<Integer.MIN_VALUE?check:Integer.MIN_VALUE;
//             return check;
//         }
//         else{
//             target-=arr[i];
//             count++;
//             if(i<arr.length){
//                 return min(arr,target,check,count,i+1);
//             }
//         }
//     }
//     public static void main(String args[]){
//         int[] arr=new int[]{1,2};
//         System.out.println(min(arr,5,Integer.MAX_VALUE,0,0));
//     }
// }
