import java.util.*;
public class tree2 {
    public static  class Node{
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
    public static Node root;
    public static int idx=-1;
    public static Node preorder(int[] arr){
        idx++;
        if(arr[idx]==-1){
            return null;
        }
        Node nw=new Node(arr[idx]);
        nw.left=preorder(arr);
        nw.right=preorder(arr);
        return nw;
    }
    public static void levelprint(Node root){
        if(root==null )return;
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
                System.out.print(curr.data+" ");
                if(curr.left!=null)queue.offer(curr.left);
                if(curr.right!=null)queue.offer(curr.right);
                
            }
        }
    }
    public static int count(Node root){
        if(root==null)return 0;
        int left=count(root.left);
        int right=count(root.right);
        return left+right+1;
    }
    
    public static int add(Node root){
        if(root==null)return 0;
        int left=add(root.left);
        int right=add(root.right);
        
        return left+right+root.data;
        
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int heightleft=height(root.left);
        int heightright=height(root.right);
        return Math.max(heightleft,heightright)+1;
    }
    public static int diameter(Node root){
        if(root==null)return 0;
        int diameter=height(root.left)+height(root.right)+1;
        int left=diameter(root.left);
        int right=diameter(root.right);
        return Math.max(right,Math.max(diameter,left));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-1,-1,4,-1,-1,4,-1,3,-1,-1};
        root=preorder(arr);
        levelprint(root);
        System.out.println();
        System.out.println(height(root));
        System.out.println(add(root));
        System.out.println(diameter(root));
    }
}
