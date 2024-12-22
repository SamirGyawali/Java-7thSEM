interface Engine{
    void start();
    void stop();
}

interface MusicPlayer{
    void playMusic();
    void stopMusic();
}

class Car implements Engine, MusicPlayer {
    public void start(){
        System.out.println("Engine starts");
    }
    public void playMusic(){
        System.out.println("Music playing");
    }
    public void stop(){
        System.out.println("Engine stops");
    }
    public void stopMusic(){
        System.out.println("Music stoped");
    }
}


public class MultipleInterface {
    public static void main(String[] args){
        Car lamborgini = new Car();
        lamborgini.start();
        lamborgini.playMusic();
        lamborgini.stop();
        lamborgini.stopMusic();
    }
}
