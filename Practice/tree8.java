import java.util.*;
public class tree8 {
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
    static class Info{
        int x;
        Node a;
        Info(){
            this.a=null;
            this.x=0;
        }
        Info(Node a,int x){
            this.a=a;
            this.x=x;
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
    public static void topview(Node root){
        Queue<Info> queue=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();//count,NOde.data
        Info rootka=new Info(root,0);
        queue.offer(rootka);
        int min=0;
        int max=0;
        while(!queue.isEmpty()){
            Info temp= new Info();
            temp=queue.poll();
            if(!map.containsKey(temp.x))map.put(temp.x,temp.a.data);
            if(temp.a.left!=null){
                queue.offer(new Info(temp.a.left,temp.x-1));
                min--;
            }

            if(temp.a.right!=null){
                queue.offer(new Info(temp.a.right,temp.x+1));
                max++;
            }

        }
        for(int i=min;i<max;i++){
            System.out.print(map.get(i)+" ");
        }
    }
public static void bottomview(Node root){
        Queue<Info> queue=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();//count,NOde.data
        Info rootka=new Info(root,0);
        queue.offer(rootka);
        int min=0;
        int max=0;
        while(!queue.isEmpty()){
            Info temp= new Info();
            temp=queue.poll();
            map.put(temp.x,temp.a.data);
            if(temp.a.left!=null){
                queue.offer(new Info(temp.a.left,temp.x-1));
                min--;
            }

            if(temp.a.right!=null){
                queue.offer(new Info(temp.a.right,temp.x+1));
                max++;
            }

        }
        for(int i=min;i<max;i++){
            System.out.print(map.get(i)+" ");
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,4,7,-1,-1,-1,5,-1,-1,3,-1,6,-1,8,-1,-1};
        Node root=createTree(arr);
        topview(root);
        System.out.println();
        bottomview(root);
    }
}
