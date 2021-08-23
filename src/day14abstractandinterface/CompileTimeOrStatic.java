package day14abstractandinterface;

public class CompileTimeOrStatic {

    public void sum() {
        int a = 5;
        int b = 7;
        int add = a + b;
        System.out.println("The Sum is: " + add);
    }

    public void sum(int a, int b) {
        int add = a + b;
        System.out.println("Sum is: " + add);
    }

    public void sum(double a, double b) {
        double add = a + b;
        System.out.println("Sum is: " + add);
    }

    public static void main(String[] args) {
        CompileTimeOrStatic ob = new CompileTimeOrStatic();
        ob.sum();
        ob.sum(4.3, 4.5);
        ob.sum(1, 2);
    }

}
