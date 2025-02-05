import java.util.*;
public class class1 {
    
    public static int avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static boolean bool(int a){
        if(a%2==0){
        return true;}
        return false;
    }
    public static boolean palin(int a){
        int rev=0;
        int temp=a;
        int n;
        while(temp!=0){
            n=temp%10;
            rev=rev*10+n;
            temp=temp/10;
        }
        
        if(rev==a){
            return true;
            
        }
        return false;
    }
    public static int binary (int arr[],int t){
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;
        
        while(mid!=t){
            mid=(s+e)/2;
            if(arr[mid]>t){
                e=mid-1;

            }
            if(arr[mid] <t){
                s=mid+1;
            }
            if(arr[mid]==t){
                return mid;
            }
        }
        return -1;

    }
   
    public static void reverse(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(e>s){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void all(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(+arr[k]+",");
                }
                System.out.print(");");
            }
            
        }
    }
    public static int maxy(int arr[]){
        int max=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                cur=0;
                for(int k=i;k<=j;k++){
                    cur=cur+arr[k];
                }

            }
            max=(max>cur?max:cur);
        }
        return max;
    }
    public static int max2(int arr[]){
        int max=Integer.MIN_VALUE;
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                curr=(i==0?pre[j]:pre[j]-pre[i-1]);
                max=(max>curr?max:curr);
            }
        }
        return max;
    }
    public static int max3(int arr[]){
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr=curr+arr[i];
            if(curr<0){
                curr=0;
            }
            max=max>curr?max:curr;

        }
        return max;
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void rotate(int arr[],int k){
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for(int j=1;j<arr.length;j++){
            
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }

       public static void main(String args[]){
        // int a;
        Scanner obj=new Scanner(System.in);
        // a=obj.nextInt();
        // int count=0;
        
        // int max=0;
        // int arr[]={1,2,4,5,3,1};
        // for(int j=0;j<a;j++){
        //     count+=arr[j];

        // }
        // for(int i=a;i<arr.length;i++){
        //    count=count+arr[i]-arr[i-a];
        //     max=(max>count?max:count);
            
        // }
        // System.out.print(max);
        // int a,b,c;
        // a=obj.nextInt();
        // b=obj.nextInt();
        // c=obj.nextInt();
        // System.out.print(avg(a,b,c));
        // System.out.print(palin(a));
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<a;j++){
        //         if(i==0||i==a-1||j==0||j==a-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(" ");
        // }
        // int arr[]=new int[5];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=obj.nextInt();
        // }
        // int max=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     max=(max>arr[i]?max:arr[i]);
        // }
        // System.out.print(max);
        // int arr[]={1,2,3,4,5};
        // int t=10;
    //    System.out.println(binary(arr,t));
        // reverse(arr);
        // pair(arr);
        // all(arr);
        // System.out.println(max3(arr));
        // rotate(arr,2);
        int[] arr={1,4,3,2,5};
        int max=Integer.MIN_VALUE;
        int e=arr.length-1;
         int find;

        
        while(e>=0){
          for(int i=0;i<e;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

          }
          e--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+";");
        }
        
    }
}
