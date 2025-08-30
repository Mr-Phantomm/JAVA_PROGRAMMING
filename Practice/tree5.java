import java.util.*;
public class tree5 {
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
        if(idx>=arr.length||arr[idx]==-1)return null;
        Node nw=new Node(arr[idx]);
        nw.left=createTree(arr);
        nw.right=createTree(arr);
        return nw;
    }
    public static Boolean check(Node root1,Node root2){
        if(root1==null&&root2==null)return true;
        else if(root1==null||root2==null)return false;
        else if(root1.data!=root2.data)return false;
        Boolean left=check(root1.left,root2.left);
        Boolean right=check(root1.right,root2.right);
        return left&&right;
    }
    public static Boolean sub(Node root1,Node root2){
        if(root1==null)return false;
        if(root1.data==root2.data)return check(root1,root2);
        
            Boolean left=sub(root1.left,root2);
            Boolean right=sub(root1.right,root2);
        
        return left||right;
    }
    
    public static void main(String args[]){
        int[] arr={1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
        Node root=createTree(arr);
        idx=-1;
        int[] arr2={2,3,-1,-1,4,-1,-1};
        Node root2=createTree(arr2);
        System.out.println(sub(root,root2));

    }
}
