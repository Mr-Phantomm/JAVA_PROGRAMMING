public class tree15 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static int idx =-1;
    public static Node create(int[] arr){
        if(idx>arr.length || arr[idx]==-1)return null;
        Node nw = new Node(arr[idx]);
        nw.left = create(arr);
        nw.right = create(arr);
        return nw;
    }
    public static void preOrder(Node root){
        if(root == null){
            System.out.print(-1+" ");
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    } 
}
