import java.util.*;
import java.lang.*;
import java.io.*;

class min_max_stack {
    Stack<int[]> st;
    
    public MinMaxStack() {
        st=new Stack<>();

    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new int[]{val,val,val});
        }
        else{
            st.push(new int[]{Math.min(val,st.peek()[0]),val,Math.max(val,st.peek()[2])});
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek()[1];
    }
    
    public int getMin() {
        return st.peek()[0];
    }
    
    public int getMax() {
        return st.peek()[2];
    }

}
public class Main {
    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();

        stack.push(5);
        System.out.println("Top: " + stack.top());       // 5
        System.out.println("Min: " + stack.getMin());    // 5
        System.out.println("Max: " + stack.getMax());    // 5

        stack.push(3);
        System.out.println("Top: " + stack.top());       // 3
        System.out.println("Min: " + stack.getMin());    // 3
        System.out.println("Max: " + stack.getMax());    // 5

        stack.push(8);
        System.out.println("Top: " + stack.top());       // 8
        System.out.println("Min: " + stack.getMin());    // 3
        System.out.println("Max: " + stack.getMax());    // 8

        stack.pop();
        System.out.println("Top: " + stack.top());       // 3
        System.out.println("Min: " + stack.getMin());    // 3
        System.out.println("Max: " + stack.getMax());    // 5
    }
}