public class tree4 {
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
    public static Node preorder(int[] arr){
        idx++;
        if(idx>=arr.length||arr[idx]==-1){
            return null;
        }
        Node nw=new Node(arr[idx]);
        nw.left=preorder(arr);
        nw.right=preorder(arr);
        return nw;
    }
    public static Boolean check(Node root1,Node root2){
        if(root1==null&&root2==null)return true;
        else if(root1==null||root2==null)return false;
        else if(root1.data!=root2.data)return false;
       
            Boolean leftcheck=check(root1.left,root2.left);
            Boolean rightcheck=check(root1.right,root2.right);
        
        return leftcheck && rightcheck;   
        }
    public static Boolean sub(Node root1,Node root2){
        if(root2==null&&root1==null)return true;
        else if(root1==null||root2==null)return false;
        if(root1.data==root2.data)return check(root1,root2);
        
        Boolean x=sub(root1.left,root2);
        Boolean y=sub(root1.right,root2);
        return x || y;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-1,-1,4,-1,-1,4,-1,3,-1,-1};
        Node root=preorder(arr);
        int[] arr2={2,3,-1,-1,4,-1,-1};
        idx=-1;
        Node root2=preorder(arr);
        System.out.println(sub(root,root2));

    }
}
