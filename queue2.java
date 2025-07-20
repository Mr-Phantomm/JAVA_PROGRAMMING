public class queue2 {
    public static class Node{
        int data;
        Node next;

        Node(){
            this.data=0;
            this.next=null;
        }

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data){
            this.data=data;
        }
    }
    public static class queue{
        Node head;
        Node tail;
        queue(){
            this.head=null;
            this.tail=null;
        }   
        public void offer(int n){
            Node newElement = new Node(n);
            if(head==null){
                head=tail=newElement;
                return;
            }
            tail.next=newElement;
            tail=tail.next;
        }
        public int poll(){
            int poppedData=head.data;
            
            Node temp=head;
            
            head=head.next;
            temp.next=null;
            
            return poppedData;
            
        }
        public int peek(){
            return head.data;
        }
        public boolean isEmpty(){
            return head==null;
        }
        public int size(){
            if(head==null)return 0;

            Node temp=head;
            int sizeOfQueue=0;
            while(temp!=null){
                sizeOfQueue++;
                temp=temp.next;
            }
            return sizeOfQueue;
        }

    }
    public static void main(String args[]){
        queue x=new queue();
        x.offer(2);
        System.out.println(x.peek());
        System.out.println(x.poll());
        // System.out.println(x.poll());
        System.out.println(x.isEmpty());
        System.out.println(x.size());

    }
}
