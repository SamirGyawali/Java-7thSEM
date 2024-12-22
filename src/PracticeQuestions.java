// Write a program where you access both static and instance variables from the main method.
class Person{
    String name;
    static int counter =0;

    Person(String name){
        this.name = name;
        counter++;
    }
    void SaySomething(){
        System.out.println("Hi it's me person");
    }
}

public class PracticeQuestions {
    static int age = 10;
    public static void main(String[] args){
        Person p1 = new Person("Abc");
        p1.SaySomething();
    }
}
