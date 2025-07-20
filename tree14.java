public class tree14 {
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
    static int idx=-1;

    // static Node createTree(int[] arr){
    //     idx++;
    //     if(arr[idx]==-1||idx>=arr.length){
    //         return null;
    //     }
    //     Node nw=new Node();
    // }
    public static Boolean subtree(Node root,Node subroot){
        if(root==null&&subroot==null)return true;
        if(root==null)return false;
    }
    public void main(String args[]){
        int a;
    }

}
