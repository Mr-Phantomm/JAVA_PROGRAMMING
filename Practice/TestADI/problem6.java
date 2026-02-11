public class problem6 {

    static int[] findTheLeaders(int a[],int n){

    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=obj.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }

        int[] ans=findTheLeaders(arr, n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
