import java.util.Scanner;
public class cf8 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String str=obj.next();
        int anton=0;
        int danik=0;
        for(int i=0;i<n;i++){
            anton+=str.charAt(i)=='A'?1:0;
            danik+=str.charAt(i)=='D'?1:0;
        }
        if(anton==danik){
            System.out.println("Friendship");
        }
        else if(anton>danik){
            System.out.println("Anton");
        }
        else{
            System.out.println("Danik");
        }
    }
    
}
