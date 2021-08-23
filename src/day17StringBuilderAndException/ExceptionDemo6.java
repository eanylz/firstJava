package day17StringBuilderAndException;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        vote(10);
        System.out.println("exit");

    }

    public static void vote(int age) {
        if (age > 18) {
            System.out.println("you are eligible to vote");
        } else {
            throw new InvalidAgeException("you are not eligible to vote");
        }
    }
}
