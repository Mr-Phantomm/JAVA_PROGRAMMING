import java.util.*;
public class stack3 {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(100);
        s1.push(80);
        s1.push(60);
        s1.push(70);
        s1.push(60);
        s1.push(85);
        s1.push(100);
        int top=s1.peek();
        int count=0;
        int max=-1;
        while(!s1.isEmpty()){
            int top2=s1.peek();
            if(top2<=top){
                count++;
                s1.pop();
            }
            else if(top2>top){
                max=max>count?max:count;
                top=top2;
                count=0;
            }
        }
        max=max>count?max:count;
        System.out.println(max);
    }
}
