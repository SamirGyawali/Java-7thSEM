class Myrunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable interface thread running");
    }
}

class myThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread from thread class");
    }
}

public class ThreadsExercise01{
    public static void main(String[] args){
        Myrunnable r1 = new Myrunnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
