import java.util.*;
public class stack5 {
    public static void main(String args[]){
        Stack<Character> n=new Stack<>();
        String a="[[]]{{}})";
        int i=0;
        for( i=0;i<a.length();i++){
            if(n.isEmpty() && (a.charAt(i)==']'||a.charAt(i)=='}'||a.charAt(i)==')')){
                System.out.println("Not Valid");
                break;
            }
            if(a.charAt(i)=='['||a.charAt(i)=='('||a.charAt(i)=='{'){
                n.push(a.charAt(i));
            }
            else if(a.charAt(i)==']'){
                if(n.peek()=='['){
                    n.pop();
                }
                else{
                    System.out.println("Not Valid");
                    break;
                }
            }
            else if(a.charAt(i)==')'){
                if(n.peek()=='('){
                    n.pop();
                }
                else{
                    System.out.println("Not Valid");
                    break;
                }

            }
            else if(a.charAt(i)=='}'){
                if(n.peek()=='{'){
                    n.pop();
                    
                }
                else{
                    System.out.println("Not Valid");
                    break;
                }

            }

        }
        if(n.isEmpty()&&i==a.length()){
            System.out.println("valid");
        }
    }
}
