//infix to prefix

import java.util.*;
public class fix4 {
    public static void main(String args[]){
        String str="9+(5-3)*4/6";
        //+9/*-5346
        Stack<String> val=new Stack<>();
        Stack<Character> oper=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                String strw=""+ch;
                val.push(strw);
            }
            else if(oper.isEmpty()||ch=='('||oper.peek()=='('){
                oper.push(ch);
            }
            else if(ch==')'){
                while(oper.peek()!='('){
                    //solve;
                    String val2=val.pop();
                    String val1=val.pop();
                    val.push(oper.peek()+val1+val2);
                    oper.pop();
                }
                oper.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    String val2=val.pop();
                    String val1=val.pop();
                    val.push(oper.peek()+val1+val2);
                    oper.pop();
                    oper.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(oper.peek()=='*'||oper.peek()=='/'){
                        String val2=val.pop();
                        String val1=val.pop();
                        val.push(oper.peek()+val1+val2);
                        oper.pop();
                        oper.push(ch);
                    }
                    else oper.push(ch);
                }
            }
        }
        while(val.size()>1){
                        String val2=val.pop();
                        String val1=val.pop();
                        val.push(oper.peek()+val1+val2);
                        oper.pop();
        }
        System.out.println(val.peek());
    }
}
//'1'-->"1"
//""+'1'-->"1"