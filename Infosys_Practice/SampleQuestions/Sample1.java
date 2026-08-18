import java.util.*;
public class Sample1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Energy = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int excercisesDone =0;
        for(int i=arr.length-1;i>=0;i--){
            int curr = arr[i];
            for(int j=0;j<2;j++){
                if(curr>Energy)break;
                else if(curr==Energy){
                    excercisesDone++;
                    System.out.println(excercisesDone);
                    return;
                }
                else{
                    excercisesDone++;
                    Energy-=curr;
                }
            }
        }
        if(Energy!=0){
            System.out.println("-1");
            return;
        }
        System.out.println(excercisesDone);
    }
}