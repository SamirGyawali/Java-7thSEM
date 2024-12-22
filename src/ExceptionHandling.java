//Modifiers:
//public: Accessible from anywhere.
//private: Accessible only within the same class.
//protected: Accessible in the same package and subclasses.
//default: Accessible only within the same package.

public class ExceptionHandling {
    public static void main(String[] args){
        try{
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }finally {
            System.out.println("This code runs no matter what");
        }
    }
}
