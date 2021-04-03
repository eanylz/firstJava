package day9;

public class StaticNonStaticTest {

    public static void main(String[] args) {
        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        System.out.println(obj.nonStaticVariable);
        obj.nonStaticMethod();

        StaticNonStaticDemo.staticMethod();
        System.out.println(StaticNonStaticDemo.staticVariable);

    }
}
