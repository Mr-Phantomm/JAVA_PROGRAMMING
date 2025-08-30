public class stackqueue {
    class Node{
        int data;
        int Node;
        Node(int data){
            this.data=data;
            this.Node=null;
        }
        Node(){
            this.Node=null;
        }
    }
    public static Node head;
    public static size=0;
    class queue{
        stackqueue l1=new stackqueue();
        queue(){
            head=null;
        }
        void push(int data){
            Node nw=new Node(data);
            if(head==null){
                head=nw;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nw;
        }
        int pop(){
            if(head==null){
                return 0;
            }
            int temp=head.data;
            head=head.next;
            return temp;
        }
        boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;

        }
        int peek(){
            if(head==null){
                return 0;
            }
            return head.data;
        }

    }
    public static Node head2;
    class stack{
        stackqueue l2=new stackqueue();
        stack(){
            head2=null;
        }
        void push(int data){
            Node nw=new Node(data);
            nw.next=head2;
            head2=nw;

        }
        int pop(){
            int temp=head2.data;
            head2=head2.next;
            return temp;
        }
        int peek(){
            return head2.data;
        }
        boolean isEmpty(){
            return head2==null;
        }
    }
    class stack(){
        int[] arr;
        static int point;
        stack(){
            point =0;
            arr=new int[5];
        }
        void push(int data){
            if(point>arr.length){
                return;
            }
            arr[point]=data;
            point++;
        }
        void pop(){
           if(point<0){
            return;
           }
           int temp=arr[point];
           point--;
           return temp; 
        }
        int top(){
            if(point<0){
                return;
               }
              return arr[point];
        }
        boolean isEmpty(){
            if(point<0){
                return false;
            }
            return true;
        }
    }
}
