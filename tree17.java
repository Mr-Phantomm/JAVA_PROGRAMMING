import java.util.*;

public class tree17 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
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
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static class Info{
            Node branch;
            int x;
            Info(int branch,int x){
                this.branch=branch;
                this.x=x;
            }

        }
        public static void topview(Node root){
            if(root==null)return;
            Queue<Info> queue=new LinkedList<>();
            Map<Integer,Integer> map=new HashMap<>();
            int min =0;
            int  max = 0;
            queue.add(root, 0);
            while(!queue.isEmpty()){
                Info curr = queue.poll();
                if(!map.containsKey(curr.x)){
                    map.put(curr.x, curr.branch.data);
                }
                if(curr.branch.left!=null){
                    queue.add(curr.branch.left, curr.x-1);
                    min--;
                }   
                if(curr.branch.right!=null){
                    queue.add(curr.branch.right,curr.x+1);
                    max++;
                }  
            }
            for(int i =min; i<=max; i++){
                System.out.println(map.get(i)+" ");
            }
        }
        public static List<Integer> kthLevel(Node root,int k){
            if(root==null)return new ArrayList<>();
            Queue<Node> queue=new LinkedList<>();
            List<Integer> list=new ArrayList<>();
            queue.offer(root);
            queue.offer(null);
            while(!queue.isEmpty()){
                Node curr=queue.poll();
                if(curr==null){
                    k--;
                    if(queue.isEmpty())break;
                    else{
                        queue.offer(null);
                    }
                }
                else{
                    if(k==1){
                       list.add(curr.data);

                    }
                    if(curr.left!=null)queue.add(curr.left);
                    if(curr.right!=null)queue.add(curr.right);
                }
            }
            return list;
        }       
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1  };
        Node root = createTree(arr);
        topview(root);
        List<Integer> list=kthLevel(root, 3);

    }
}
