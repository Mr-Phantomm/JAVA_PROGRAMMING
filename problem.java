import java.util.*;
public class problem {
    public static void spiral(int[][] arr){
        // int startingcol=0;
        // int startingrow=0;
        // int endcolumn=arr.length-1;
        // int endrow=arr[0].length-1;
        
        // while(startingcol<=endcolumn&&startingrow<=endrow){
        //     for(int i=startingrow;i<endrow;i++){
        //         System.out.print(arr[startingcol][i]+" ");
        //     }
        //     for(int i=startingcol;i<endcolumn;i++){
        //         System.out.print(arr[i][startingrow]+" ");
        //     }
        //     for(int i=endrow;i>startingrow;i--){
        //         System.out.print(arr[endcolumn][i]+" ");
        //     }
        //     for(int i=endcolumn;i>startingcol;i--){
        //         System.out.print(arr[i][startingrow]+" ");
        //     }
        //         startingrow++;
        //         startingcol++;
        //         endcolumn--;
        //         endrow--;
        // }
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow&&startcol<=endcol){
        for(int i=startcol;i<=endcol;i++){
                System.out.print(arr[startrow][i]+" ");
        }
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(arr[i][endcol]+" ");
        }
        for(int i=endcol-1;i>=startcol;i--){
            if(startrow==endrow){
                break;
            }
            System.out.print(arr[endrow][i]+" ");
        }
        for(int i=endrow-1;i>startrow;i--){
            if(startcol==endcol){
                break;
            }
            System.out.print(arr[i][startcol]+" ");

        }
        startcol++;
        startrow++;
        endrow--;
        endcol--;
    }
    }
    public static void main(String args[]){
        int[][] arr=new int[4][4];
        Scanner obj=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        spiral(arr);
    }
}
