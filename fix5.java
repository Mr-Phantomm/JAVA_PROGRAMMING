//postfix evaluation 
// import java.util.*;
// public class fix5 {
//     public static void main(String args[]){
//         String str="9534/6*-+";
//         Stack<Integer> st=new Stack<>();
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch>='0'&&ch<='9'){
//                 st.push(ch-'0');
//             }
//             else {
//                 int val2=st.pop();
//                 int val1=st.pop();
//                 if(ch=='+')st.push(val1+val2);  
//                 if(ch=='-')st.push(val1-val2);  
//                 if(ch=='*')st.push(val1*val2);  
//                 if(ch=='/')st.push(val1/val2);

//             }
//         }
//         System.out.println(st.peek());
//     }
// }
//prefix evaluation
// import java.util.*;
// public class fix5 {
//     public static void main(String args[]){
//         String str="+9/*-5346";
//         Stack<Integer> st=new Stack<>();
//         for(int i=str.length()-1;i>=0;i--){
//             char ch=str.charAt(i);
//             if(ch>='0'&&ch<='9'){
//                 st.push(ch-'0');
//             }
//             else {
//                 int val1=st.pop();
//                 int val2=st.pop();
//                 if(ch=='+')st.push(val1+val2);  
//                 if(ch=='-')st.push(val1-val2);  
//                 if(ch=='*')st.push(val1*val2);  
//                 if(ch=='/')st.push(val1/val2);

//             }
//         }
//         System.out.println(st.peek());
//     }
// }
//postfix to infix
import java.util.*;
public class fix5{
    public static void main(String args[]){
        String str="9+3+4*5/7";
        Stack<Integer> val=new Stack<>();
        Stack<Character> oper=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9')val.push(ch-'0');
            else if(oper.isEmpty()||ch=='('||oper.peek()=='(')oper.push(ch);
            else if(ch==')'){
                while(oper.peek()!='('){
                    int val2=val.pop();
                    int val1=val.pop();
                    if(oper.peek()=='+')val.push(val1+val2); 
                    if(oper.peek()=='-')val.push(val1-val2); 
                    if(oper.peek()=='*')val.push(val1*val2); 
                    if(oper.peek()=='/')val.push(val1/val2); 
                    oper.pop();

                }
                oper.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    int val2=val.pop();
                    int val1=val.pop();
                    if(oper.peek()=='+')val.push(val1+val2); 
                    if(oper.peek()=='-')val.push(val1-val2); 
                    if(oper.peek()=='*')val.push(val1*val2); 
                    if(oper.peek()=='/')val.push(val1/val2); 
                    oper.pop();
                    oper.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(oper.peek()=='*'||oper.peek()=='/'){
                        int val2=val.pop();
                        int val1=val.pop();
                        if(oper.peek()=='*')val.push(val1*val2); 
                        if(oper.peek()=='/')val.push(val1/val2); 
                        oper.pop();
                        oper.push(ch);
                    }
                    else oper.push(ch);
                }
            }
        }
        while(val.size()>1){
            int val2=val.pop();
                    int val1=val.pop();
                    if(oper.peek()=='+')val.push(val1+val2); 
                    if(oper.peek()=='-')val.push(val1-val2); 
                    if(oper.peek()=='*')val.push(val1*val2); 
                    if(oper.peek()=='/')val.push(val1/val2); 
                    oper.pop();
        }
        System.out.println(val.peek());
    }
}