public class Multithreading {
    public static void main(String[] args){
        // there will be 3 threads
        for(int i=0;i<=3;i++){
            MultithreadThing myThread = new MultithreadThing(i);
            myThread.start();
        }
        throw new RuntimeException();

    }
}
