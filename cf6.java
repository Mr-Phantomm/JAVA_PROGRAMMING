import java.util.*;
public class cf6 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        while(n>0){
            int x=obj.nextInt();
            
            Stack<Character> st1=new Stack<>();
            String st=obj.next();
            for(int i=0;i<st.length();i++){
                char ch=st.charAt(i);
                st1.push(ch);

            }
            int s=1;
            int e=x;
            Stack<Integer> st2=new Stack<>();
            while(!st1.isEmpty()){
                if(st1.peek()=='<'){
                    st2.push(s);
                    s++;
                    st1.pop();
                }
                else{
                    st2.push(e);
                    e--;
                    st1.pop();
                }
            }
            st2.push(s);
            while(!st2.isEmpty()){
                System.out.print(st2.peek()+" ");
                st2.pop();
            }
            System.out.println();
            n--;
        }
    }
}
