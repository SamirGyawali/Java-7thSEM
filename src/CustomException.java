class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args){
        try{
            checkAge(18);
            System.out.println("You can enter");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
    static void checkAge(int age) throws MyException{
        if(age <18){
            throw new MyException("Custom Exception: Age must be 18 or above.");
        }
    }
}
