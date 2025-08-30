import java.util.*;
public class tree6 {
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
    public static Node createTree(int[] arr){
        idx++;
        if(arr[idx]==-1||idx>=arr.length){
            return null;
        }
        Node nw=new Node(arr[idx]);
        nw.left=createTree(arr);
        nw.right=createTree(arr);
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
                System.out.print(curr.data+" ");
                if(curr.left!=null)queue.offer(curr.left);
                if(curr.right!=null)queue.offer(curr.right);
            }
        }

    }
    // public static int count(Node root){
    //     if(root==null)return 0;
    //     return count(root.left)+count(root.right)+1;
    // }
    // public static int height(Node root){
    //     if(root==null)return 0;
    //     return Math.max(height(root.left),height(root.right))+1;
    // }
    // public static int sum(Node root){
    //     if(root==null)return 0;
    //     return root.data+sum(root.left)+sum(root.right);
    // }
    static class Info{
        int dia;
        int hei;
        Info(int dia,int hei){
            this.dia=dia;
            this.hei=hei;
        }

    }
    public static Info diameter(Node root){
        if(root==null)return new Info(0,0);
        return new Info(Math.max(diameter(root.left).dia,Math.max(diameter(root.right).dia,(diameter(root.left).hei+diameter(root.right).hei+1))),Math.max(diameter(root.left).hei,diameter(root.right).hei)+1);

    }
    public static boolean check(Node root1,Node root2){
        if(root1==null&&root2==null)return true;
        else if(root1==null||root2==null) return false;
        if(root1.data!=root2.data)return false;
        Boolean left=check(root1.left,root2.left);
        Boolean right=check(root1.right,root2.right);
        return left&&right;
    }
    public static Boolean sub(Node root1,Node root2){
        if(root1==null)return false;
        if(root1.data==root2.data){
            return check(root1,root2);
        }
        Boolean left=sub(root1.left,root2);
        Boolean right=sub(root1.right,root2);
        return left||right;

    }
    static Map<Integer,Node> map= new HashMap<>();
    public static void topview(Node root,int count){
        if(root==null)return;
        if(!map.containsKey(count)){
            map.put(count,root);
        }
        topview(root.left,count-1);
        topview(root.right,count+1);
    }
    public static void bottomview(Node root,int count){
        if(root==null)return;
        map.put(count,root);
        bottomview(root.left,count-1);
        bottomview(root.right,count+1);
    }
    
    public static void main(String args[]){
        int[] arr={1,2,6,-1,-1,3,-1,-1,4,-1,5,-1,-1};
        Node root=createTree(arr);
        idx=-1;
        int[] arr2={2,-1,3,-1,4,-1,-1};
        Node root2=createTree(arr2);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println();
        // System.out.println(count(root));
        // System.out.println(height(root));
        // System.out.println(sum(root));
        System.out.println(diameter(root).hei+" "+diameter(root).dia);
        System.out.println(sub(root,root2));
        topview(root,0);
        
        for(int key : map.keySet()){
            System.out.print(map.get(key).data+" ");
        }
        System.out.println();
        map.clear();
        bottomview(root,0);
        for(int key : map.keySet()){
            System.out.print(map.get(key).data+" ");
        }

    }
}
