public class buystock {
    public static void main(String args[]){
        int x;
        int arr[]={7,1,5,3,6,4};
        int[] maxright=new int[arr.length];
        maxright[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            maxright[i]=maxright[i+1]>arr[i]?maxright[i+1]:arr[i];
        }  
        for(int i=0;i<arr.length;i++){
            maxright[i]=maxright[i]-arr[i];

        }
        x=maxright[0];
        for(int i=1;i<arr.length;i++){
            x=(x>maxright[i]?x:maxright[i]);
        }
        System.out.println(x);
    }
}
