public class tree{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node tree(int i,int[] arr){
        if(i>=arr.length||arr[i]==-1)return null;
        Node curr = new Node(arr[i]);
        curr.left=tree(2*i+1,arr);
        curr.right=tree(2*i+2,arr);
        return curr;
    }

    
    
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,-1,3,4};
        Node root = tree(0,arr);

    }
}