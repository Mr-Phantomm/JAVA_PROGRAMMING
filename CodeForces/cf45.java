import java.util.Scanner;
public class cf45 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int[] arr=new int[k-1];
        int ans=0;
        for(int i=0;i<k-1;i++){
            int x=obj.nextInt();
            if(x==1){
                ans++;
                // System.out.println("Added at "+(i+1));
                arr[i]=1;
            }
        }
        int x=obj.nextInt();
        if(x==1){
            ans++;
        // System.out.println("Added at "+k);
    }
    for(int i=0;i<n-k;i++){
        x=obj.nextInt();
        if(x==1){
            // System.out.println("Added at "+(i+k+1));
            ans++;
        }
        if(i<k-1&&((x==0&&arr[arr.length-i-1]==1)||(x==1&&arr[arr.length-i-1]==0))){
                // System.out.println("Sub at "+(i+k+1));
                ans--;
            }
        }
        System.out.println(ans);
    }
}
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
// 1 1 1 1 1 1 0 1 0 0  1  1  0  1  1  1  1  1  0  0  1  1  0  0  0  0  0  1  0  1  1  0  1  0  1  0  1  0  1  1  0  0  0  0  0  1  1  1  0  1  1  0  0  0  1  0  0  0  1  1  1  0  1  0  0  1  1  1  0  1  1  1  0  0  1  1  0  1  0  0  0  1  0  0  0  0  0  0  1  1  1  0  0  1  1  1  0  1  0  0 