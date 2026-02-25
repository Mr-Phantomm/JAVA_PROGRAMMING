package Linked_List;

public class Node<E> {
    E data;
    Node<E> next;
    Node(){
        next=null;
    }
    Node(E data){
        this.data=data;
        this.next=null;
    }
    Node(E data,Node<E> next){
        this.data=data;
        this.next=next;
    }
    @Override
    public String toString(){
        return this.data.toString()+"";
    }
}
