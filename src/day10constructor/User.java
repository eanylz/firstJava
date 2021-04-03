package day10constructor;

public class User {

    String name;
    int age;

    public User(String n, int a) {
        name = n;
        age = a;

        System.out.println("constructor called");
    }

    public void displayInfo() {
        System.out.println("Name is:" + name);
        System.out.println("age is:" + age);
    }

    public static void main(String[] args) {
        User user1 = new User("Anil",29);
        user1.displayInfo();
        System.out.println("===================");
        User user2 = new User("Acm",31);
        user2.displayInfo();

    }
}


/*
constructor is special method
has same name as class name
has no return type
cannot even use 'void'
mainly used to initialize member's data
runs only once for each object
can have any access modifier
//////////////////////////////////
if there is not any constructor, then compiler provides one default constructor
constructor overloading- either by number of args,type or order
*/

