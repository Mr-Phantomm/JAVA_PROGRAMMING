import java.util.*;
import java.lang.*;
import java.io.*;


class Message {
    public String msg;
    public int timeStamp;
    public Message(String msg, int timeStamp) {
        this.msg = msg;
        this.timeStamp = timeStamp;
    }
}

interface MessageTracker {
    Message getMessage();    
}
class check{
    String msg;
    int time;
    boolean bool;
    check(String msg,int time,boolean bool){
        this.msg=msg;
        this.time=time;
        this.bool=bool;
    }
}
class RobotTracker
{
    MessageTracker messageTracker;
    Map<String,check> map=new HashMap<>();
    Queue<check> queue=new LinkedList<>();

    public RobotTracker(MessageTracker messageTracker) {
        this.messageTracker = messageTracker;
    }
    
    public void pollMessage() {
        while (true) {
            Message message = messageTracker.getMessage();
            shouldPrintMessage(message);
        }
    }
    /*
    
        [1, "Hello"] , [2, "Hello"], [8, "Bye"], [12, "Hello"], [13, "Bye"]
        Answer is : [1, "Hello"], [8, "Bye"], [12, "Hello"]
    */
    
    public void shouldPrintMessage(Message message) {
        // Add your implementation here
        String recievedMessage=message.msg;
        int time=message.timeStamp;
        check ch=new check(recievedMessage,time,false);
        queue.offer(ch)
        if(map.containsKey(recievedMessage)){
            
        }

    }
    
    public static void main(String args[]) {
        RobotTracker robotTracker = new RobotTracker(null);
        robotTracker.shouldPrintMessage(new Message("hello" , 1)); // print this
        robotTracker.shouldPrintMessage(new Message("hello" , 2));
        robotTracker.shouldPrintMessage(new Message("bye" , 8)); //print this
        robotTracker.shouldPrintMessage(new Message("hello" , 12)); //print this
        robotTracker.shouldPrintMessage(new Message("bye" , 13));
    }
}
