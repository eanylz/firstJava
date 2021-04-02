package day4;

public class OperatorsDemo5 {
    public static void main(String[] args) {

        //conditional operator
        int a = 5;
        int b = 6;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
        String s = (a > b) ? "a is greater than b" : "b is greate than a";
        System.out.println(s);
    }
}
