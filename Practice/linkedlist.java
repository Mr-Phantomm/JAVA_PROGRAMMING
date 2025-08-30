import java.util.*;
public class linkedlist{
    static Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public void start(int n){
        Node nw=new Node(n);
        if (head==null){
            head = nw;
            return;
        }
        nw.next=head;
        head=nw;
    }
    public static void  print(){
        if(head==null){
            System.out.println("Empty list");
        }
        Node curr=head;
        while(curr!= null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
        System.out.print("null");

    }
    public void end(int n){
        Node nw = new Node(n);
        if(head == null){
            head = nw;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=nw;
        nw.next=null;
    }
    public static void main(String args[]){
        linkedlist list = new linkedlist();
        list.start(1);
        list.start(2);
        list.start(3);
        list.end(4);
        list.end(7);
        list.print();
        
    }
}