import java.util.Stack;

public class tree19 {
    public static class Node{
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

    public static int idx=-1;
    public static Node createTree(int[] arr){
        idx++;
        if(arr[idx]==-1||idx>=arr.length){
            return null;
        }
        Node nw=new Node(arr[idx]);
        nw.left=createTree(arr);
        nw.right=createTree(arr);
        return nw;
    }

    public static void removeCommon(Stack<Node> st1,Stack<Node> st2){
        while(!st1.isEmpty()&&!st2.isEmpty()&&st1.peek()==st2.peek()){
            st1.pop();
            st2.pop();
        }

    } 

    public static boolean fillStack(Stack<Node> st,Node root,Node p){
        if(root==null)return false;
        if(root==p||fillStack(st, root.left, p)||fillStack(st,root.right,p)){
            st.push(root);
            return true;
        }
        return false;
    }

    public static int distanceBetweenTwoNodes(Node root,Node p,Node q){
        if(root==null)return 0;
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        fillStack(st1,root,p);
        fillStack(st2,root,q);
        removeCommon(st1, st2);
        return st1.size()+st2.size()+1;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root=createTree(arr);
        Node p=root.left.left;
        Node q=root.right.right;
        System.out.println(distanceBetweenTwoNodes(root, p, q));

    }

}
