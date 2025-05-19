import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ishitastudent3 {
     static class Node{
        int data;
        Node left;
        Node right;

        Node(){
            this.left = null;
            this.right= null;
        }
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
            
        }
}
    public static Node root;
    public static int idx = -1;
    public static Node createTree(int[] arr){
        idx++;
        if(idx>=arr.length || arr[idx]==-1){
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left = createTree(arr);
        nw.right = createTree(arr);
        return nw;
    }
    // public static Node copyTree(Node root){
    //     if(root == null)return null;
    //     Node nw = new Node(root.data);
    //     nw.left = copyTree(root.left);
    //     nw.right = copyTree(root.right);
    //     return nw;

    // }
    // public static void preOrder(Node root){
    //     if(root == null) {
    //         System.out.print(-1+" ");
    //         return;
    //     }
    //     System.out.print(root.data+" ");
    //     preOrder(root.left);
    //     preOrder(root.right);
    // }
  
    // public static ArrayList<Integer> l1 = new ArrayList<>();
    // public static void kthTree(Node root, int k, int count){
    //     if(root == null) return ;
    //     if(count == k ) {
    //       l1.add(root.data);
    //       return;
        
    //     }

        
    //     kthTree(root.left, k , count+1);

    //     kthTree(root.right, k, count+1);
        
    // }
    // public static int count = 1;
    // public static void kthTree(Node root, int k){
    //     if(root == null){
    //         return;
    //     }
    //     Queue<Node> q = new LinkedList<>();
    //     q.add(root);
    //     q.add(null);
    //     if(!q.isEmpty() )
    //     while(!q.isEmpty()){
    //         Node curNode = q.remove();
    //         if(curNode == null){
    //             //System.out.println();
    //             count++;
    //             if(q.isEmpty()){
    //                 break;
    //             }
    //             else{
    //                 q.add(null);
    //             }
    //         }
    //         else{
    //             if(k==count){
    //                 System.out.print(curNode.data+" ");
    //             }
    //             if(curNode.left!=null)q.add(curNode.left);
    //             if(curNode.right!=null)q.add(curNode.right);
    //         }
            

    //     }

    // }
    public static void reverse(Stack<Node> st) {
        if (!st.isEmpty()) {
            Node temp = st.pop();
            reverse(st);
            insertAtBottom(st, temp);
        }
    }

    private static void insertAtBottom(Stack<Node> st, Node item) {
        if (st.isEmpty()) {
            st.push(item);
        } else {
            Node temp = st.pop();
            insertAtBottom(st, item);
            st.push(temp);
        }
    }
    public static Node compare(Stack<Node> st1, Stack<Node> st2){
        reverse(st1);
        reverse(st2);
        Node temp = null;
       
        while(!st1.isEmpty()&& !st2.isEmpty()){
            if(st1.peek()==st2.peek()){
                temp = st1.pop();
                 st2.pop();
            }
            else{
                break;  // Stop as soon as you find the first mismatch
            }
        }
        
        return temp;
    }
    public static boolean usingStack(Stack<Node> st,Node root , Node find){
       
        if(root == null) return false;
        st.push(root);
        if(root == find){
            return true;
        }
        if(usingStack(st, root.left, find) || usingStack(st, root.right, find)){
            return true;
        }
        st.pop();
        return false;
          
      
    }
    
      public static void main(String[] args) {
        int[] arr = {1,2,4,7,-1,-1,-1,5,-1,-1,3,-1,6,-1,8,-1,-1};
        Node root = createTree(arr);
        Node p=root.left.left.left;//7
        Node q=root.right.right.right;//8
        //Node root1 =copyTree(root);
        // preOrder(root1);
        // System.out.println();
       // kthTree(root, 3);
       Stack<Node> st1 = new Stack<>();
       usingStack(st1, root,  p);
       Stack<Node> st2 = new Stack<>();
       usingStack(st2, root,  q);
       Node lca = compare(st1, st2);
       System.out.println((lca!=null)?lca.data:"not found");





    }
    
}