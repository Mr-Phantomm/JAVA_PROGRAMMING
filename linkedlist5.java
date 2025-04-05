public class linkedlist5{
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(){
            this.next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public void addlast(int data){
        Node nw=new Node(data);
        if(head==null){
            head=tail=nw;
            return;
        }
        tail.next=nw;
        tail=nw;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void bubblesort(Node temp){
        if(temp==head){
            return;
        }
        Node max=head;
        Node temp2=head.next;
        while(temp2!=temp){
            max=(max.data>temp2.data?max:temp2);
            temp2=temp2.next;
        }
        int num=temp.data;
        temp.data=max.data;
        max.data=num;
        temp2=head;
        while(temp2.next!=temp){
            temp2=temp2.next;
        }
        bubblesort(temp2);

    }
    public void reverse(Node temp){
        if(temp==null){
            return;
        }
        
    }
    public static void main(String[] args) {
        linkedlist5 ll=new linkedlist5();
        ll.addlast(7);
        ll.addlast(6);
        ll.addlast(5);
        ll.addlast(4);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(1);
        // ll.bubblesort(tail);
        ll.print();
        

    }

}