package day8;

import day9.StaticNonStaticDemo;

public class MethodDemo1 {

    public void greet(){

        System.out.print("Hello, ");
        System.out.println("How are you");
    }
    public void displayInfo(String name, int age , String address){
        System.out.println("My name is: "+ name+" ,"+ "age is "+age+ "and address is "+address);
    }


    public static void main(String[] args) {
       MethodDemo1 obj = new MethodDemo1();
       obj.greet();
       obj.displayInfo("Anil", 29, "Mesa");


    }
}
