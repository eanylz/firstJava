package day17StringBuilderAndException;

import java.util.Scanner;

public class ExceptionDemo3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = input.nextInt();
        System.out.println("Enter num 2: ");
        int b = input.nextInt();


        try {
            System.out.println("try start");
            int div = divide(a, b);
            System.out.println("division is " + div);
            System.out.println("try end");
        } catch (ArithmeticException ae) {
            System.out.println("Inside catch block");
        }
        finally{
            //finally always runs
            System.out.println("inside finally block");
            input.close();
        }
        System.out.println("exit");

    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

