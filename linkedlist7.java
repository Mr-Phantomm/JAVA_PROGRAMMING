import java.util.*;
public class linkedlist7 {
    public class Node{
        int data;
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
    public void addatlast(int x){
        Node nw=new Node(x);
        if(head==null){
            head=tail=nw;
            return;
        }
        tail.next=nw;
        tail=tail.next;
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
    public static Node mid(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
    }
    public static Node rev(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void zigzag(){
        Node mid=mid(head);
        Node head2=rev(mid);
        Node temp1=head;

        Node temp2=head2;
        Node nexttemp1=head.next;
        Node nexttemp2=head2.next;
        
        while(temp2!=null&&temp1!=null){
            // temp1.next=temp2;
            // temp1=nexttemp1;
            // if(nexttemp1!=null)nexttemp1=nexttemp1.next;
            // temp2.next=temp1;
            // temp2=nexttemp2;
            // if(nexttemp2!=null)nexttemp2=nexttemp2.next;
            nexttemp1=temp1.next;
            temp1.next=temp2;
            nexttemp2=temp2.next;
            temp2.next=nexttemp1;
            temp1=nexttemp1;
            temp2=nexttemp2;
        }
        // temp1.next=temp2;
         
          
    }
    public static void main(String args[]){
        linkedlist7 ll = new linkedlist7();
        int x;
        Scanner obj=new Scanner(System.in);
        x=obj.nextInt();
        for(int i=0;i<x;i++){
            int y=obj.nextInt();
            ll.addatlast(y);

        }
        ll.zigzag();
        ll.print();

        
    }
}
