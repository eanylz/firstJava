package day2;

import java.util.Scanner;

public class Addition2UsingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println(a + b);
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}
