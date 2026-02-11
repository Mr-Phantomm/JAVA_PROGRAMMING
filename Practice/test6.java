public class test6 {

    public int funcAvg(int[][] arr,int N){
        int[] add=new int[N+1];
        for(int i=0;i<arr.length;i++){
            int src=arr[i][0];
            int dest=arr[i][1];
            int value=arr[i][2];
            add[src-1]=value;
            add[dest]=-value;
        }
        int sum=add[0];
        for(int i=1;i<add.length-1;i++){
            add[i]=add[i-1]+add[i];
            sum+=add[i];
            
        }
        return sum/N;
    }
    public static void main(String[] args) {
        
    }
}