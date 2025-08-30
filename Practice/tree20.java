public class tree20 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(){
            this.data=0;
        }
        Node(int data){
            this.data=data;
        }
    }
    public static Node head=new Node();
    public static int idx=-1;
    public static Node createTree(int[] arr){
        idx++;
        if(idx>=arr.length||arr[idx]==-1){
            return null;
        }
        Node nw=new Node(arr[idx]);
        nw.left=createTree(arr);
        nw.right=createTree(arr);
        return nw;
    }
    public static Node lca(Node root,Node p,Node q){
        if(root==null||root==p||root==q)return root;
        Node left=lca(root.left,p,q);
        Node right=lca(root.right,p,q);
        if(left==null)return right;
        if(right==null)return left;
        return root;
    }
    public static int dis(Node root,Node p){
        if(root==null)return -1;
        if(root==p)return 0;
        int left=dis(root.left,p);
        int right=dis(root.right,p);
        if(left==-1&&right==-1)return -1;
        if(left==-1)return right+1;
        else return left+1;
    }
    public static int mindis(Node root,Node p,Node q){
        Node lca=lca(root,p,q);
        // System.out.println(lca.data);
        
        return dis(lca,p)+dis(lca,q);
    }

    public static void main(String args[]){
        int arr[]=new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root=createTree(arr);
        Node p=root.left.left;
        Node q=root.right.right;
        System.out.println(mindis(root,p,q));
    }
}
