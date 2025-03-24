public class linkedlist3 {
    static class  Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(){
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public static void add(int data){
        Node nw=new Node(data);
        if(head==null){
            head=tail=nw;
            return;
        }
        Node temp=head;
        
    }
    public static void main(String args[]){
        
    }
}
