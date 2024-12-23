class Counter{
    private int count = 0;

    // synchronized method to ensure only one thread can access it at a time
    public synchronized void increment(){
        count++;
        System.out.println(count);
    }
}

public class ThreadSynchronized {
    public static void main(String[] args){
        Counter c1 = new Counter();

        // Creating two threads that will increament the counter
        Thread t1 = new Thread(()->{
            for(int i=0; i<5; i++){
                c1.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0; i<5; i++){
                c1.increment();
            }
        });

        t1.start();
        t2.start();

    }
}
