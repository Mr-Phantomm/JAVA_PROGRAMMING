import java.util.*;

public class infix_to_postfix {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int T=0;
        T = obj.nextInt();
        for(int t=0;t<T;t++){
            Stack<Character> st=new Stack<>();
            String out="";
            
            while(obj.hasNextLine()){
                String l=obj.nextLine();
                if(l.equals(""))break;
                char c=l.charAt(0);
                if(Character.isLetterOrDigit(c)){
                    out += c;
                }
                else if(c=='('){
                    st.push(c);
                } 
                else if(c==')'){
                    while(!st.isEmpty() && st.peek()!='(') out += st.pop();
                    st.pop();
                } else {
                    while(!st.isEmpty() && prec(st.peek())>=prec(c))
                        out += st.pop();
                    st.push(c);
                }
            }

            while(!st.isEmpty()) out += st.pop();
            System.out.println(out);
        }
    }

    static int prec(char o){
        if(o=='+'||o=='-') return 1;
        if(o=='*'||o=='/') return 2;
        if(o=='^') return 3;
        return 0;
    }
}