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

    public static void main(String args[]){
        int[] arr={1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
        Node root=createTree(arr);
        idx=-1;
        int[] arr2={2,3,-1,-1,4,-1,-1};
        Node root2=createTree(arr2);
        
    }
}
