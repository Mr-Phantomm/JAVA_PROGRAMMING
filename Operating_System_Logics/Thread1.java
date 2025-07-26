public class Thread1{
    public static void main(String args[]){
        Thread t1=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread t2=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread t3=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread t4=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            Thread t4=new Thread(()->{
                System.out.println(Thread.currentThread().getName());
            });
        });
        t1.setName("Ish");
        t1.setPriority(10);
        t1.start();
        t1.run();
        System.out.println(Thread.currentThread().getName());
    }
}


        // Thread t1=new Thread(()->{
        //     int count =0;
        //     for(int i=0;i<10000;i++)count+=i;
        //     System.out.println(Thread.currentThread().getName()+count);
        // });
        // t1.setName("i");
        // // t1.setPriority(10);
        // t1.run();
        // System.out.println(Thread.currentThread().getName());