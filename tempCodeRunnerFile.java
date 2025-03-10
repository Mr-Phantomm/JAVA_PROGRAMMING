public static void binary(int[] arr, int start ,int end,int target){
        int mid=start+(end-start)/2;
        if(start>end){
           System.out.println("not found");
        }
        if(arr[mid]==target){
            System.out.println("found at "+ mid);
        }
        else if(arr[mid]<target){
            binary(arr,mid+1,end,target);
        }
        else if(arr[mid]>target){
            binary(arr,start,mid-1,target);
        }
        
    }