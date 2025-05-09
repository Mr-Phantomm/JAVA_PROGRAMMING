import java.util.*;

public class tree7 {
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
    static class Info{
        Node curr;
        int x;
        Info(Node curr,int x){
            this.curr=curr;
            this.x=x;
        }
    }

    public static void topview(Node root){
        Map<Integer,Integer> map=new HashMap<>();
        Queue<Info> queue =new LinkedList<>();
        queue.offer(new Info(root,0));
        int min=0;
        int max=0;
        while(!queue.isEmpty()){
            Info curr=queue.poll();
            if(!map.containsKey(curr.x)){
                map.put(curr.x,curr.curr.data);
            }
            if(curr.curr.left!=null){
                queue.offer(new Info(curr.curr.left,curr.x-1));
                min-;
            }
            if(curr.curr.right!=null){
                queue.offer(new Info(curr.curr.right,curr.x+1));
                max++;
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i)+" ");
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,4,-1,-1,5,7,-1,-1,8,-1,-1,3,-1,6,-1,-1};
        Node root=createTree(arr);
        topview(root);
    }
}
