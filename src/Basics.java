import java.util.Arrays;

public class Basics {
    public static void main(String[]args){
        // our first program
        System.out.println("Hello world");
        String name = "You";
        int age = 30;
        //primitive
        // byte - 1 [-128, 127]
        // short - 2
        // int - 4
        // long - 8
        // float - 4
        // double - 8
        // char - 2
        // boolean - 1 true/false


        byte sn = 30;
        long phone = 123456789567890L;
        float pi = 3.14F;
        char letter = 'a';
        boolean isAdult = true;

        // Non-primitive type reference type memory
        String word = "this is string";
        String word2 = new String("this is string");
        String friend = new String("aapu");
        String friend2 = new String("aapu"+word2+"and");
        System.out.println(word.replace('i', 'b'));

        // Arrays
        int physics = 97;
        int chem = 98;
        int eng = 95;
        int maths = 99;

        int[] marks = new int[4];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        marks[3] = 99;
        System.out.println(marks.length);

        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        String[] subjects = {"maths", "physics", "english", "chemestry"};
        System.out.println(subjects[1]);

        int[][] finalmarks = {{97,98,99}, {95,96,98}};
        System.out.println(finalmarks[0][2]);

        // typecasting
        int a = 100;
        int b = a+(int)13.00;
        System.out.println(b);

        // constrants final keyword
        final float PI = 3.14F;

        // operators

    }
}