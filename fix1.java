//infix calculation
import java.util.*;
public class fix1 {
    public static void main(String args[]){
        String str="9-5+3*4/6";
        Stack<Integer> value=new Stack<>();
        Stack<Character> oper=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                value.push((int)ch-48);
            }
            else if(oper.isEmpty()||ch=='('||oper.peek()=='('){
                oper.push(ch);
            }
            else if(ch==')'){
                while(oper.peek()=='('){
                    int value2=value.pop();
                    int value1=value.pop();
                    if(oper.peek()=='+')value.push(value2+value1);
                    if(oper.peek()=='-')value.push(value1-value2);
                    if(oper.peek()=='*')value.push(value1*value2);
                    if(oper.peek()=='/')value.push(value1/value2);
                    oper.pop();

                }
                oper.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    
                    int value2=value.pop();
                    int value1=value.pop();
                    if(oper.peek()=='+')value.push(value2+value1);
                    if(oper.peek()=='-')value.push(value1-value2);
                    if(oper.peek()=='*')value.push(value1*value2);
                    if(oper.peek()=='/')value.push(value1/value2);
                    oper.pop();
                    oper.push(ch);
                }
                else if(ch=='*'||ch=='/'){
                    if(oper.peek()=='*'||oper.peek()=='/'){
                        int value2=value.pop();
                    int value1=value.pop();
                    if(oper.peek()=='*')value.push(value1*value2);
                    if(oper.peek()=='/')value.push(value1/value2);
                    oper.pop();
                    oper.push(ch);
                    }
                    else{
                        oper.push(ch);
                    }
                }
            }
        }
        while(value.size()>1){
            int value2=value.pop();
            int value1=value.pop();
            if(oper.peek()=='+')value.push(value2+value1);
            if(oper.peek()=='-')value.push(value1-value2);
            if(oper.peek()=='*')value.push(value1*value2);
            if(oper.peek()=='/')value.push(value1/value2);
            oper.pop(); 
        }
        System.out.println(value.peek());
    }
}
