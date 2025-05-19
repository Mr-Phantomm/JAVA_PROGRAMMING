import java.util.*;

public class tree9 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node() {
            this.left = null;
            this.right = null;
        }
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        Node(Node n1) {
            this.data = n1.data;
            this.left = null;
            this.right = null;
        }}
    static int idx = -1;
    public static Node createTree(int[] arr) {
        idx++;
        if (arr[idx] == -1 || idx >= arr.length) {
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left = createTree(arr);
        nw.right = createTree(arr);
        return nw;}
    static List<Integer> list = new ArrayList<>();

    public static Node copytree(Node root) {
        if (root == null)
            return null;
        Node nw = new Node(root);
        if (root.right != null)
            nw.right = copytree(root.right);
        if (root.left != null)
            nw.left = copytree(root.left);
        return nw;
    }

    public static void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    // public static void kthlevel(Node root,int level,int k){
    // if(root==null)return;
    // if(level==k){
    // list.add(root.data);
    // return;
    // }
    // kthlevel(root.left,level+1,k);
    // kthlevel(root.right,level+1,k);
    // }
    public static void kthlevel(Node root, int k) {
        int count = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            if (count > k)
                break;
            Node curr = queue.remove();
            if (curr == null) {
                if (queue.isEmpty())
                    break;
                else {
                    count++;
                    queue.offer(null);

                }
            } else {
                if (count == k) {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null)
                    queue.offer(curr.left);
                if (curr.right != null)
                    queue.offer(curr.right);
            }
        }
    }

    public static Boolean fillstack(Stack<Node> path, Node root, Node find) {
        if (root == null) {
            return false;
        }
        path.push(root);
        if (root == find)
            return true;
        if (fillstack(path, root.left, find) || fillstack(path, root.right, find)) {
            return true;
        }
        path.pop();
        return false;
    }

    public static void reverse(Stack<Node> st) {
        if (!st.isEmpty()) {
            Node temp = st.pop();
            reverse(st);
            insertAtBottom(st, temp);
        }
    }

    private static void insertAtBottom(Stack<Node> st, Node item) {
        if (st.isEmpty()) {
            st.push(item);
        } else {
            Node temp = st.pop();
            insertAtBottom(st, item);
            st.push(temp);
        }
    }

    public static Node compare(Stack<Node> st1, Stack<Node> st2) {
        Node temp = null;
        while ((!st1.isEmpty() && !st2.isEmpty()) && (st1.peek() == st2.peek())) {
            temp = st1.pop();
            st2.pop();

        }
        return temp;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = createTree(arr);

        Node p = root.left.left; // Node with data 4
        Node q = root.left.right; // Node with data 5

        if (p == null || q == null) {
            System.out.println("One of the target nodes (p or q) is null.");
            return;
        }

        Stack<Node> st1 = new Stack<>();
        fillstack(st1, root, p);

        Stack<Node> st2 = new Stack<>();
        fillstack(st2, root, q);

        reverse(st1);
        reverse(st2);

        Node lca = compare(st1, st2);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor: " + lca.data); // Expected: 2
        } else {
            System.out.println("No common ancestor found.");
        }
    }
}
