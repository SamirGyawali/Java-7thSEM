class MyCustomException extends Exception{
    public MyCustomException(String cause){
        super(cause);
    }
}

public class CustomExceptionPractice {
    public static void main(String[] args){
        try{
            checkAge(12);
        }catch (MyCustomException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws MyCustomException{
        if(age < 18) throw new MyCustomException("Age is small");
    }
}
