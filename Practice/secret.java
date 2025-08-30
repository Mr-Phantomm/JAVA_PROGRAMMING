public class secret{
    public static void ishita(int age){
        if(age==0)return;
        ishita(age-10);
        System.out.println(age);
    }
    public static void main(String args[]){
        ishita(50);

        
    }
}