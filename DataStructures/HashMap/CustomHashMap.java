public class CustomHashMap<K,V> {
    @SuppressWarnings("unchecked")
    Node<K,V>[] MapArray=new Node[32];
    class Node<K,V>{
        K key;
        V value;
        Node<K,V> next;
        Node(K key,V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int getHashCode(K key){
        return (key.hashCode())*(key.hashCode()<0?-1:1)%32;
    }

    /*
        Returns the value stored 
    */

    public V get(K key){
        if(key==null)return null;
        int hash = getHashCode(key);
        Node<K,V> head = MapArray[hash];
        while(head!=null&&!head.key.equals(key)){
            head=head.next;
        }
        return head.value;
    }

    /*
        Stores the value for a particular key
    */

    public void put(K key,V value){
        if(key==null)return;
        int hash = getHashCode(key);
        Node<K,V> head = MapArray[hash];
        Node<K,V> newNode = new Node<K,V>(key,value);
        if(head==null){
            MapArray[hash]= newNode;
            return;
        }
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            if(head.next==null)break;
            head=head.next;
        }
    
        head.next = newNode;
    }
}


