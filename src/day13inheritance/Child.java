package day13inheritance;

public class Child extends Parent{


    public Child(){
        super(4); //given by compiler// defined explicitly
        System.out.println("Child's default constructor...");
    }
    public Child(int a){
        super(); //also given by compiler
        System.out.println("Child's arg constructor");
    }
    String name = "Hello, from child...";

    public void sayHello(){
        System.out.println(name);
        System.out.println(super.name);
        System.out.println("function from child");
        super.sayHello();
    }

}
