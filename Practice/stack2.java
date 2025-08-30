import java.util.*;
import java.lang.*;
public class stack2 {
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // static class Stack{
    //     static Node head=null;
    //     public boolean isEmpty(){
    //         return head==null;
    //     }
    //     public void push(int data){
    //         Node nw=new Node(data);
    //         if(head==null){
    //             head=nw;
    //             return;
    //         }
    //         // head.next=nw;
    //         nw.next=head;
    //         head=nw;
    //     }
    //     public int pop(){
    //         // Node temp=head;
    //         // Node prev;
    //         // while(temp.next!=null){
    //         //     prev=temp;
    //         //     temp=temp.next;
    //         // }
    //         // int lastdata=temp.data
    //         // prev.next=null;
    //         if(isEmpty()){
    //              return -1;
    //         }
    //         int lastdata=head.data;
    //         Node temp=head;
    //         head=head.next;
    //         temp.next=null;
    //         return lastdata;
    

    //     }
    //     public int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }

    // }
    public static void pushatBottom(Stack<Integer> s1,int x){
        // Stack<Integer> s2=new Stack<>();
        // while(!s1.isEmpty()){
        // s2.push(s1.pop());}
        // s1.push(x);
        // while(!s2.isEmpty()){
        //     s1.push(s2.pop());
        // }
        if(s1.isEmpty()){
            s1.push(x);
            return;
        }
        int top=s1.pop();
        pushatBottom(s1, x);
        s1.push(top);

        }
        public static String reversestr(String str){
            Stack<Character> s2=new Stack<>();
            for(int i=0;i<str.length();i++){
                s2.push(str.charAt(i));
            }
            StringBuilder str2 = new StringBuilder("");
            while(!s2.isEmpty()){
                str2.append(s2.pop());
            }
            return str2.toString();
        }
        public static void reverse(Stack<Integer> s1){
            if(s1.isEmpty()){
                return;
            }
            int top=s1.pop();
            reverse(s1);
            pushatBottom(s1,top);
        }
    public static void main(String args[]){
        // Stack s1=new Stack();
        Stack<Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        // pushatBottom(s1,4);
        reverse(s1);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
        // String a="abcd";
        // a=reversestr(a);
        // System.out.println(a);

    }
}
