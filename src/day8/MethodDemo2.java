package day8;

import java.util.Scanner;

public class MethodDemo2 {

    public String greet(){
        String g = "Hello good morning";
        return g;
    }
    public int findMax(int a, int b){

        if(a>b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) {
        MethodDemo2 obj1 = new MethodDemo2();
        String s = obj1.greet();
        System.out.println(s);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1 = sc.nextInt();
        System.out.println("enter num 2");
        int num2 = sc.nextInt();
        int max = obj1.findMax(num1,num2);
        System.out.println("The max number is "+max);

    }
}
