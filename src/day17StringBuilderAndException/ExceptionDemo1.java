package day17StringBuilderAndException;

import java.util.Scanner;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a= input.nextInt();
        System.out.println("Enter num 2: ");
        int b = input.nextInt();

        int div = a/b;
        System.out.println("division is "+div);

        String s = null;
        System.out.println(s.concat("Hello"));
    }
}

//try
//catch
//finally
//throw
//throws
//Checked-IO, SQL--direct child of exception
//UNCHECKED-runtime plus AE,NULLPOINTER,NUMBER FORMAT