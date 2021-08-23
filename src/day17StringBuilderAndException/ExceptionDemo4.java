package day17StringBuilderAndException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        try {
            System.out.println("Enter num1: ");
            int a = input.nextInt();
            System.out.println("Enter num 2: ");
            int b = input.nextInt();

            System.out.println("try start");
            int div = divide(a, b);
            System.out.println("division is " + div);

        } catch (ArithmeticException ae) {
            System.out.println("Inside catch block"+ae);
        }
        catch (InputMismatchException im){
            System.out.println("exception");
        }
        catch (Exception e){
            System.out.println("exception");
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
