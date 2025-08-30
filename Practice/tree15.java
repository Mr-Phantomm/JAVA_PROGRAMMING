import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class tree15{
    public static void main(String args[]){
        public class Node{
            int data;
            Node left;
            Node right;
            Node(){
                this.data=0;
                this.left=null;
                this.right=null;
            }
        }
        public static int idx=-1;
        public static void createTree(int[] arr){
            idx++;
            if(idx>=arr.length||arr[idx]==-1){
                return null;
            }
            Node nw=new Node(arr[idx]);
            nw.left=createTree(arr);
            nw.right=createTree(arr);
            return nw;
        }
        public static void preorder(Node root){
            if(root==null){
                System.out.println(-1);
                return;
            }
            System.out.print(root.data+" ")
            preorder(root.left);
            preorder(root.right);
        }
        public static void levelorder(Node root){
            if(root==null)return;
            Queue<Node> queue=new Queue<>();
            queue.offer(root);
            queue.offer(null);
            while(!queue.isEmpty()){
                    Node curr=queue.poll();
                    if(curr==null){
                        System.out.println();
                        if(queue.isEmpty()){
                            break;
                        }
                        else{
                            System.out.print(curr.data);
                            if(q.peek()!= null)System.out.print(" ");
                            if(curr.left!=null)q.offer(curr.left);
                            if(curr.right!=null)q.offer(curr.right);
                        }
                    }
            }
        }
        static class Info{
            int val;
            Node temp;
            Info(int val, Node temp){
                this.val = val;
                this.temp= temp;
            }

        }
        public static void topView(Node root){
            if(root== null)return;
            Queue<Info> q = new LinkedList<>();
            Map<Integer, Node> map = new HashMap<>();
            q.add(new Info(0, root));
            while(!q.isEmpty()){
                Info curr = q.poll();

                if(!map.containsKey(curr.val)){
                    map.put(curr.val, curr.temp);
                }
                
            }
            
            
            
        }
    }
}