public class tree1{
     public static class Node{
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
    public static Node head;
    static int idx=-1;
    public static Node last(int[] arr){
        idx++;
        if(arr[idx]==-1){
            return null;
        }
        Node nw=new Node(arr[idx]);
        nw.left=last(arr);
        nw.right=last(arr);
        return nw;

    }
    public static void preorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-1,-1,4,-1,-1,4,-1,3,-1,-1};
        head=last(arr);
        System.out.println(head.data);
        preorder(head);
        System.out.println();
        inorder(head);
        System.out.println();
        postorder(head);

    }
}