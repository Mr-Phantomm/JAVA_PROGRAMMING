public class Thread4 {
    public  static class Thread1 extends Thread{
        public void run(){
           System.out.println(this.currentThread().getName()); 
        }
    }
    
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
    }
}
