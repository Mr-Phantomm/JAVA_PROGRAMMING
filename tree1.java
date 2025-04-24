public class tree1 {
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
   public static int i=-1;
    public static Node root;
    public static Node tree(int[] arr){
        i++;
        if(i>=arr.length||arr[i]==-1){
            return null;
        }
        Node root =new Node(arr[i]);
        root.left=tree(arr);
        root.right=tree(arr);
        
        return root;
    }
    public static void print(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    
    public static void printinorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
        
    }
    
    public static void main(String args[]){
        int[] arr=new int[]{1,2,4,5,6,-1};
        Node root =tree(arr);
        print(root);
        System.out.println();
        printinorder(root);
    }
}
