public class oops3 {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        // deep copy
        // Node(Node nw){
        //     this.data=nw.data;
        //     this.next=new Node(nw)
        // }
        // shallow Copy
        Node(Node nw){
            this=nw;
        }
    }
}
