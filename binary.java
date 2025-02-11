public class binary {
    public static int sqrt(int n){
        int target=n;
        int s=0;
        int e=n;
        int ans=-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mid*mid==target){
                return mid;
            }
            if(mid*mid>target){
                e=mid-1;
            }
            if(mid*mid<target){
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int n=10;
        System.out.println(sqrt(n));

    }
}
