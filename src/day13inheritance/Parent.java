package day13inheritance;

public class Parent extends Object{

    public Parent(){
        System.out.println("Parent's default constructor");
    }
    public Parent(int a){
        System.out.println("Parent's arg constructor");
    }
    String name = "Hello, I am Parent...";

    public void sayHello(){
        System.out.println("function from parent");
    }
}


//what do not inherit?
//1.private members
//2.hidden variables// if same variable in child and parent, child variable is used.
//3.overridden methods
//4.static

//if both parent and child have constructor then parent's constructor is called and then child's.
//even if there is arg constructor, default is called from parent
//if we want to call parent's arg constructor, we need to define explicitly.

//Object is the root class of all class

//If parent method doesn't throw any exception, child can only throw only unchecked exception(eg arithmetic)
//not throws exception(checked)

//if parent method throws exception, child method should not throw or throw same or child exception

//access modifier should be same or larger in child method.
