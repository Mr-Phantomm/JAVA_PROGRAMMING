import java.nio.channels.Pipe.SourceChannel;
import java.security.NoSuchAlgorithmException;

public class linkedlist2 {
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            this.next=null;
        }
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public static void addfirst(int value){
        Node nw=new Node(value);
        size++;
        if(head==null){
            head=tail=nw;
            return;
        }
        nw.next=head;
        head=nw;
    }
    public static void addlast(int value){
        Node nw=new Node(value);
        size++;
        if(tail==null){
            head=tail=nw;
            return;
        }
        tail.next=nw;
        tail=nw;


    }
    public static void addatindex(int i,int data){
        size++;
        Node temp2=head;
        for(int j=0;j<i-1;j++){
            temp2=temp2.next;
        }
        
        Node nw=new Node(data);
        nw.next=temp2.next;
        temp2.next=nw;
    }
    public static void Removefirst(){
        
        if(head==null){
            return;
        }
        size--;
        Node temp=head;
        head=head.next;  
        temp.next=null;
    }
    public static void removeLast(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
            
        }
        tail=temp;
        tail.next=null;
    }
    public static void removemiddle(int i){
        Node temp1=head;
        Node temp2=head;
        for(int j=0;j<i+1;j++){
            if(j<i-1){
                temp1=temp1.next;
            }
            temp2=temp2.next;
            
        }
        temp1.next=temp2;
    }
    public static int search(Node temp,int i,int x){
        
        if(temp==null){
            return -1;
        }
        if(temp.value==i){
            return x;
        }
        else{
            return search(temp.next,i,x+1);
        }
        
        
    }
    public static void reverse(){
        if(head==null||head.next==null){
            return;
        }
        Node temp=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=temp;
            temp =curr;
            curr=next;
            
        } 
        tail=head;
        head=temp;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"=>");
            temp=temp.next; 
            
        }
        System.out.print("null");

    }
    public static Node mid(){
        
        Node slow = head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean palindromecheck(){
        if(head==null||size==0){
            return true;
        }
        Node prev=null;
        Node curr=mid();
        Node next=null;
        Node temp=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;            
        }
        while(prev!=null&&temp!=null){
            if(prev.value!=temp.value){
                return false;
            }
            prev=prev.next;
            temp=temp.next;
        }
        return true;
    }
    public static void main(String args[]){
        linkedlist2 ll=new linkedlist2();
        // ll.head=new Node(2);
        // ll.tail=ll.head;
        // ll.tail=new Node(3);
        // ll.head.next=ll.tail;
        // ll.addfirst(5);
        ll.addlast(6);
        // ll.addlast(7);
        ll.addlast(8);
        ll.addlast(8);
        ll.addlast(6);
        ll.addlast(8);
        // ll.addlast(9);
        // ll.addatindex(2,3);
        System.out.println(ll.size);
        ll.print();
        System.out.println();
        // ll.Removefirst();
        // System.out.println();
        // ll.print();
        // ll.removeLast();
        // System.out.println();
        // ll.print();
        // ll.removemiddle(1);
        // System.out.println();
        // ll.print();
        // System.out.println(ll.search(head,7,0));
        ll.reverse();
        ll.print();
        System.out.println();
        System.out.println(ll.palindromecheck());


        
    }
}

