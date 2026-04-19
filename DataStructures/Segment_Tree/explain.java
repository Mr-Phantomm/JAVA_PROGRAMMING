
public class explain{

    public static void build(int[] ans,int i, int[] arr,int left,int right){
        if(left==right){
            ans[i] = arr[left];
            return;
        }
        int mid = (right-left)/2+left;
        build(ans,2*i+1,arr,left,mid);
        build(ans,2*i+2,arr,mid+1,right);
        ans[i]=ans[2*i+1]+ans[2*i+2];
    }

    public static int query(int index,int left,int right,int[] ans,int queryLeft,int queryRight){
        if(left>queryRight||right<queryLeft)return 0;// No match
        if(left>=queryLeft && right<=queryRight){
            return ans[index]; //complete match
        }

        //Partial Match
        int mid = (right-left)/2+left;
        int leftAns = query(2*index+1,left,mid,ans,queryLeft,queryRight);
        int rightAns = query(2*index+2,mid+1,right,ans,queryLeft,queryRight);
        // System.out.println(leftAns+" "+ rightAns+" "+index);  
        return leftAns+rightAns;
    }

    public static void update(int index,int left,int right,int[] ans,int updateIndex,int updateValue){
        if(left>updateIndex||right<updateIndex)return;

        if(left==updateIndex&&right==updateIndex){
            ans[index]=updateValue;
            return;
        }
        int mid=(right-left)/2+left;
        if(updateIndex<=mid){
            update(2*index+1,left,mid,ans,updateIndex,updateValue);
        }
        else{
            update(2*index+2,mid+1,right,ans,updateIndex,updateValue);
        }
        ans[index]=ans[2*index+1]+ans[2*index+2];
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,5,7,1,2,3,8,1};
        // 1---5
        //Approach 1
        // int sum=0;
        // for(int i=1;i<=5;i++){
        //     sum+=arr[i];
        // }
        // System.out.println(sum);

        // //Approach 2
        // int[] sum = new int[arr.length];
        // sum[0]=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     sum[i]=sum[i-1]+arr[i];
        //     System.out.print(sum[i]+" ");
        // }
        // // System.out.println(sum[5]-sum[0]);
        // // 
        // // 

        // Approach 3 Segment tree
        int[] ans = new int[4*arr.length];
        build(ans,0,arr,0,arr.length-1);
        int a = query(0,0,arr.length-1,ans,2,5);
        System.out.println(a);
        update(0,0,arr.length-1,ans,2,8);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}