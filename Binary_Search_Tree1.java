import java.util.LinkedList;
import java.util.Queue;

public class Binary_Search_Tree1 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    
    public static Node createTree(int a,Node root){
        if(root==null){
            return new Node(a);
        }
        if(a<root.data){
            root.left=createTree(a, root.left);
        }
        else{
            root.right=createTree(a, root.right);
        }
        return root;
    }
    public static Node search(Node root,int key){
        if(root==null||root.data==key)return root;
        if(root.data>key)return search(root.left,key);
        else{
           return  search(root.right,key);
        }
    }

    // public static void 

    public static void levelorder(Node root){
        if(root==null)return;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            if(curr==null){
                if(queue.isEmpty())break;
                else{
                    System.out.println();
                    queue.offer(null);
                }
            }
            else{
                System.out.print(" "+curr.data+" ");
                if(curr.left!=null)queue.offer(curr.left);
                if(curr.right!=null)queue.offer(curr.right);
            }
        }

    }
    public static void printTree(Node root){
        if(root==null)return;
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }
    public static Node delete(Node root,int k){
        if(root.data<k){
            root.right=delete(root.right,k);

        }
        else if(root.data>k){
            root.left=delete(root.left,k);
        }
        else{
            if(root.left==null&&root.right==null){
                return null;
            }
            if(root.left==null)return root.right;
            else if (root.right==null)return root.left;
            

            else{
                Node suc=getSuccessor(root);
                int temp=suc.data;
                suc.data=k;
                root.data=temp;
                delete(root, k);
            }
        }
        return root;
    }
    public static Node getSuccessor(Node root){
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }
    public static void main(String args[]){
        int arr[]=new int[]{5,2,4,3,1,8,7,6,9};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=createTree(arr[i],root);
        }
        levelorder(root);
        System.out.println();
        delete(root,4);
        levelorder(root);
        printTree(root);

    }
}
