public class Thread5 {
    public static class myRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new myRunnable());
        t1.run();
        t1.start();
    }
}
