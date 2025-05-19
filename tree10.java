import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class tree10 {
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
        }} 
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
    public static void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static Boolean filllist(List<Node> list,Node root,Node find){
        if(root==null)return false;
        list.add(root);
        if(root==find){
            return true;
        }
        if(filllist(list,root.left,find)||filllist(list,root.right,find)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
    public static Node compare(List<Node> arr1,List<Node> arr2){
        int i=0;
        while(arr1.get(i)==arr2.get(i)){
            i++;
        }
        return arr1.get(i-1);
    }
    public static void main(String args[]){
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = createTree(arr);
        
        Node p = root.left.left; // Node with data 4
        Node q = root.left.right; // Node with data 5

        if (p == null || q == null) {
            System.out.println("One of the target nodes (p or q) is null.");
            return;
        }

    List<Node> st1 = new ArrayList<>();
        filllist(st1, root, p);

        List<Node> st2 = new ArrayList<>();
        filllist(st2, root, q);


        Node lca = compare(st1, st2);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor: " + lca.data); // Expected: 2
        } else {
            System.out.println("No common ancestor found.");
        }
    }
}
