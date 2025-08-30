import java.util.*;
class hello
{
    // public static void check(int f)
    // {
    //     int a=0;
    //     for(int i=2;i<=f/2;i++){
    //         if(f%i==0){
    //             a=1;
    //             break;
    //         }
    //     }
    // if(a==0){
    //     System.out.println("Prime");
    // }
    // else if(a==1){
    //     System.out.println("Not Prime");
    // }
    // }
   
    public static void main(String[] args){
        // int n=3;
        // double jk=5.543;



        // System.out.println(jk);
        // System.out.println(n);
        // System.out.println("Hello World");
        // Scanner obj =new Scanner(System.in);
        // int f= obj.nextInt();
        // System.out.println(f);
        // int x=5;
        // int y=9;
        // int mx=Math.max(x,y);
        // int min=Math.min(x,y);
        // System.out.println(mx);
        // System.out.println(min);
        
        // int ran =(int)(Math.random()*10);
        // System.out.println(ran);
        // Scanner obj = new Scanner (System.in);
        // int f=obj.nextInt();
        // check(f);
        int num = 16;
        int count=0;
        if(num>1){
        while(num>1){
            if(num%2==0){
                num=num/2;
                continue;
            }
            if(num%2==1){
                num=num/2;
                count++;
            }
        }
        if(count==1){
            System.out.println("Power");
        }
        else{
            System.out.println("Not power");
        }
    }
        
      


    }
} 