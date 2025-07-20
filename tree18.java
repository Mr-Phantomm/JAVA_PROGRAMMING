import java.util.*;
public class tree18 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(){
            this.data=0;
            this.left=null;
            this.right=null;
        }
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=-1;
    public static Node createTree(int[] arr){
        idx++;
        if(idx>=arr.length||arr[idx]==-1){
            return null;
        }
        Node nw=new Node(arr[idx]);
        nw.left=createTree(arr);
        nw.right=createTree(arr);
        return nw;
    }
    public static boolean fillStack(Stack<Node> st,Node root,Node p){
        if(root==null)return false;
        if(root==p||fillStack(st, root.left, p)||fillStack(st, root.right, p)){
            st.push(root);
            return true;
        }
        return false;
    }
    // public static void reverse(Stack<Node> st){
    //     if(st.isEmpty())return;
    //     Node temp=st.pop();
    //     reverse(st);
    //     insertAtBottom(st,temp);
    // }
    // public static void insertAtBottom(Stack<Node> st,Node temp){
    //     if(st.isEmpty()){
    //         st.push(temp);
    //         return;
    //     }
    //     Node temp2=st.pop();
    //     insertAtBottom(st, temp);
    //     st.push(temp2);

    // }
    public static Node compare(Stack<Node> st1,Stack<Node> st2){

        Node prev=new Node();
        System.out.println(st1.peek().data);
        while(st1.peek()==st2.peek()&&!st1.isEmpty()&&!st2.isEmpty()){
            st1.pop();
            prev=st2.pop();    
        }
        return prev;
    }
    // public static void printStack(Stack<Node> st2){
    //     Stack<Node> st=new Stack<>();
    //     st.addAll(st2);
    //     while(!st.isEmpty()){
    //         System.out.print(st.peek().data+" ");
    //         st.pop();
    //     }
    //     System.out.println();
    //     // System.out.println(st2);
    // }
    public static Node common(Node root,Node p,Node q){
        if(root==null)return null;
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        fillStack(st1, root, p);
        fillStack(st2, root, q);
        // printStack(st1);
        // printStack(st2);
        // reverse(st1);
        // printStack(st1);
        // reverse(st2);
        // printStack(st2);
        return compare(st1,st2);

    }

    public static void main(String args[]){
        int arr[]=new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root=createTree(arr);
        Node p=root.left.left;
        Node q=root.right.right;
        Node z=common(root,p,q);
        System.out.println(z.data);

    }
}
