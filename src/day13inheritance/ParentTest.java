package day13inheritance;

public class ParentTest {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.sayHello();
        System.out.println(p.name);

        System.out.println("================");
        Child c = new Child();
        c.sayHello();
        System.out.println(c.name);

        System.out.println("========");
        Child c1 = new Child();
        Child c2 = new Child(5);

        System.out.println("==============");
        Parent c3 = new Child(5);// implicit type casting
        c3.sayHello();

        System.out.println("============");
//        Parent p5 = new Parent();
//        Child cc = (Child) p5;
//        Child cc = (Child) new Parent();// Explicit



    }
}
