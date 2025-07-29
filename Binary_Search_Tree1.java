public class Binary_Search_Tree1 {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node root=new Node();
    public Node createTree(int arr[]){
        if(arr.length==0)return null;
        root=arr[0];
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            while()
        }
    }
    public void printTree(Node root){
        if(root==null)return;
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }
    public static void main(String args[]){
        int arr[]=new int[]{5,2,4,3,1,8,7,6,9};

    }
}
