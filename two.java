import java.util.*;
public class two {
    public static void main(String[] args){
    //     int x=12;
    //     if((x&1)==0){
    //         System.out.println("even");
    //     }
    //     else{
    //         System.out.println("odd");
    //     }

        String name;
        int x;
        long fee;
        double cl;
        String s;
        String status;
        String country;
        Scanner obj= new Scanner (System.in);
        name=obj.nextLine();
        x=obj.nextInt();
        fee=obj.nextLong();
        cl=obj.nextDouble();
        s=obj.nextLine();
        status = obj.nextLine();
        country = obj.nextLine();

        System.out.println(name);
        System.out.println(x);
        System.out.println(fee);
        System.out.println(cl);
        System.out.println(s);
        System.out.println(status);
        System.out.println(country);
    
    }
}
