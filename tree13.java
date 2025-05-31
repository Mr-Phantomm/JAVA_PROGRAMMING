import java.util.Stack;

public class tree13 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(){
            this.left=null;
            this.right=null;
        }
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
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
    public static int min(Node root,Node p,Node q,Boolean x){
        if(root==null)return 0;
        if(root==p||root==q)return 1;
        int left=min(root.left,p,q,x);
        int right=min(root.right,p,q,x);
        if(left>0&&right>0)x=true;
        return x?left+right:left+right+1;
    }
    public static void main(String args[]){
        int[] arr={ 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root=createTree(arr);
        Node p = root.left.left;
        Node q = root.left.right;
        System.out.println(min(root,p,q,false));

    }
}
