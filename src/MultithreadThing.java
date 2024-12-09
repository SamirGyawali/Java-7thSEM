public class MultithreadThing extends Thread{
    private int threadNumber;

    // this is the constructor
    public MultithreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        // each thread will print number from 1 to 5
        for(int i = 1; i<=5; i++){
            System.out.println("Number "+i + " from thread "+ threadNumber);
            if(threadNumber == 3){
                throw new RuntimeException();
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Woopsi something went wrong");
            }
        }
    }
}
