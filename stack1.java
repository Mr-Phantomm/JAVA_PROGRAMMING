import java.util.ArrayList;

public class stack1 {
    static class stack{
            public static ArrayList<Integer> a= new ArrayList<>();
            public static boolean isempty(){
                if(a.size()>0){
                    return false;
                }
                return true;
            }
            public static void push(int data){
                a.add(data);
            }
            public static int pop(){
                int top=a.get(a.size()-1);
                a.remove(a.size()-1);
                return top;
            }
            public static int peek(){
                return a.get(a.size()-1);
            }


    }
    public static void main(String args[]){
        stack s1=new stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        while(!s1.isempty()){
            System.out.println(s1.pop());
        }

    }
}
 