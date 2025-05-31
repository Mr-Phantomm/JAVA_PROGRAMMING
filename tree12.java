import java.util.*;
public class tree12 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node() {
            this.left = null;
            this.right = null;
        }
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        Node(Node n1) {
            this.data = n1.data;
            this.left = null;
            this.right = null;
        }
    } 
    static int idx = -1;
    public static Node createTree(int[] arr) {
        idx++;
        if (arr[idx] == -1 || idx >= arr.length) {
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left = createTree(arr);
        nw.right = createTree(arr);
        return nw;
    }
    // public static Node lca(Node root,Node p,Node q,Boolean x,int count){
    //     if(root==null||root==p||root==q){
    //         return root;
    //     }
    //     Node left=

    // }
    public static Boolean fill(Stack<Node> st,Node root,Node find){
        if(root==null)return false;
        st.push(root);
        if(root==find)return true;
        if(fill(st,root.left,find)||fill(st,root.right,find))return true;
        st.pop();
        return false;

    }
    public static void main(String args[]){
        int[] arr={ 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root=createTree(arr);
        Node p = root.left.left; // Node with data 4
        // Node q = root.left.right;
        // int count=0;
        // Node Lca=lca(root,p,q,false,count);
        Stack<Node> st=new Stack<>();
        fill(st,root,p);
        int k=2;
        for(int i=0;i<k;i++){
            st.pop();
        }
        System.out.println(st.peek().data);
    }
}
