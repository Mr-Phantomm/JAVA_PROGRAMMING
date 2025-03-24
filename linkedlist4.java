public class linkedlist4 {
    public class Node{
            int data;
            Node next;
            Node(){
                this.next=null;
            }
            Node(int data){
                this.data=data;
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
    public void addatfirst(int data){
        Node nw= new Node(data);
        if(head==null){
            head=tail=nw;
            return;
        }
        nw.next=head;
        head=nw;

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
    public void createaloop(int Place){
        Node temp=head;
        for(int i=0;i<=Place;i++){
            temp=temp.next;

        }
        tail.next=temp;
    }
    public boolean findloop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public void correctloop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                slow.next.next.next.next=null;
                print();
                return;
            }
        }
        System.out.println("No Loop");
    }
    public static void main(String[] args) {
        linkedlist4 ll=new linkedlist4();
        ll.addatfirst(3);
        ll.addatfirst(4);
        ll.addatfirst(5);
        ll.addatfirst(6);
        ll.addatfirst(7);
        ll.addatfirst(8);
        ll.addatfirst(9);
        ll.addatfirst(10);
        ll.addatfirst(11);
        ll.addatfirst(12);
        ll.print();
        ll.createaloop(3);
        
        System.out.println(ll.findloop());
        ll.correctloop();
    }
}
