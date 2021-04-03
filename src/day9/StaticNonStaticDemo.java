package day9;

public class StaticNonStaticDemo {

    String nonStaticVariable = "This is non Static Variable";
    static String  staticVariable = "This is Static Variable";

    public void nonStaticMethod(){
        System.out.println("this is non static method");
    }
    public static void staticMethod(){
        System.out.println("This is static method");
    }

    public static void main(String[] args) {

        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        obj.nonStaticMethod();
        System.out.println(obj.nonStaticVariable);

        staticMethod();
        System.out.println(staticVariable);
        StaticNonStaticDemo.staticMethod();

    }

}
