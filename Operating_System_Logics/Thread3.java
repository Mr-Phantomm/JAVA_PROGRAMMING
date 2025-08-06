public class Thread3 {

    public static void main(String[] args) throws InterruptedException{
        Thread t1= new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread t2= new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread t3= new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(Thread.currentThread().getName());

    }
}
