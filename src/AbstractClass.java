abstract class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
    abstract void sound();
    public void walk(){};
}

// extended or class made by abstract class
// we can make the object of Dog class
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void sound(){
        System.out.println("Bark");
    }
    @Override
    public void walk(){
        System.out.println(new Dog("coco").name + " is comming");
    }
}


public class AbstractClass {
    public static void main(String[] args){
        Dog d1 = new Dog("coco");
        d1.sound();
        System.out.println(d1.name);
        d1.walk();
    }
}
