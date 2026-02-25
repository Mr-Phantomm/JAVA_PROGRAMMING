package Linked_List;
/*
    Insert at first
    Insert at last
    remove at first 
    remove at last
    isEmpty
    size
    peekFirst
    peekLast
*/
public class LinkedList<E>{
    Node<E> head;
    Node<E> tail;
    int size;
    // Constructor 
    LinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    //size
    int size(){
        return size;
    }
    //isEmpty
    boolean isEmpty(){
        return size==0;
    }
    //InsertAtFirst
    void InsertAtFirst(E data){
        Node<E> nw=new Node<E>(data);
        this.size++;

        if(head==null){
            head=nw;
            tail=nw;
            return;
        }

        nw.next=head;
        head=nw;

    }
    //Insert at last
    void InsertAtLast(E data){
        Node<E> nw = new Node<E>(data);
        this.size++;
        if(tail==null){
            head=nw;
            tail=nw;
            return;
        }

        tail.next=nw;
        tail=nw;
    }

    //Remove at First
    E removeAtFirst() throws Exception{
        if(size()==0){
            throw new Exception("Buddy Linked List is Empty What you are taking out ??");
        }
        size--;
        E data=head.data;
        Node<E> temp=head;
        head=head.next;
        temp.next=null;
        return data;
    }

    //RemoveAtLast 
    E removeAtLast() throws Exception{
        if(size()==0){
            throw new Exception("Buddy Linked List is Empty What you are taking out ??");
        }
        size--;
        E data=tail.data;
        Node<E> temp=head;
        while(temp.next.next==null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        return data;
    }

    //peekFirst
    E peekFirst() throws Exception{
        if(size()==0){
            throw new Exception("Buddy Linked List is Empty What you are Looking at ??");
        }
        return head.data;
    }

    //peekLast
    E peekLast() throws Exception{
        if(size()==0){
            throw new Exception("Buddy Linked List is Empty What you are Looking at ??");
        }
        return tail.data;
    }

    // toString
    public String toString(){
        if(size()==0)return "";
        StringBuilder str=new StringBuilder("");
        Node<E> temp=head;
        while(temp.next!=null){
            str.append(temp+"=>");
            temp=temp.next;
        }
        str.append(temp);
        return str.toString();
    }

    // reverse a Linked List
    public void reverse(){

        Node<E> prev=null;
        Node<E> curr=head;
        Node<E> next=head.next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        tail=head;
        head=prev;

    }

    // Cycle Detection
    public boolean hasCycle(){
        Node<E> slow=head;
        Node<E> fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
    
}
