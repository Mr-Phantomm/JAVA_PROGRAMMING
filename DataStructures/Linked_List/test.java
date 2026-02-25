package Linked_List;

public class test {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.InsertAtFirst(1);
        ll.InsertAtLast(2);
        ll.InsertAtLast(3);
        ll.InsertAtLast(4);
        System.out.println(ll);
        ll.reverse();
        System.out.println(ll);
    }
}
