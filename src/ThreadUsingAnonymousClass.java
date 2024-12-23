public class ThreadUsingAnonymousClass extends Thread{
    public static void main(String[] args){
        Thread t1 = new Thread(){
            @Override
            public void run(){
                System.out.println("This is an anonymous thread!");
            }
        };

        t1.start();
    }
}
