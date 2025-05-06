import java.util.*;

public class tree3 {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(){
            this.left=null;
            this.right=null;
        }
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static Node head;
    static int idx=-1;
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
    // public static int height(Node root){
    //     if(root==null)return 0;
    //     int left=height(root.left);
    //     int right=height(root.right);
    //     return Math.max(left,right)+1;
    // }
    // public static int diameter(Node root){
    //     if(root==null)return 0;
    //     int dia=height(root.left)+height(root.right)+1;
    //     int left=diameter(root.left);
    //     int right=diameter(root.right);
    //     return Math.max(dia,Math.max(left,right));
    // }
    public static class Info{
        int height;
        int dia;
        Info(int height,int dia){
            this.dia=dia;
            this.height=height;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info rootki=new Info(Math.max(diameter(root.left).height,diameter(root.right).height)+1,Math.max(diameter(root.left).dia,Math.max(diameter(root.right).dia,(diameter(root.left).height+diameter(root.right).height+1))));
        return rootki;
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
                System.out.print(curr.val+" ");
                if(curr.left!=null)queue.offer(curr.left);
                if(curr.right!=null)queue.offer(curr.right);
                
            }
        }
    }   
    public static void main(String[] args) {
        int[] arr={1,2,3,-1,-1,4,-1,-1,4,-1,3,-1,-1};
        Node root=preorder(arr);
        // System.out.println(height(root));
        // System.out.println(diameter(root));
        levelprint(root);
        Info dia=diameter(root);
        System.out.println();
        System.out.println(dia.height+" "+dia.dia);
    }
}
