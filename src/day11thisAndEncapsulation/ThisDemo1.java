package day11thisAndEncapsulation;

public class ThisDemo1 {
    //shadowing is the process of hiding instance variable by local variable inside non static method and constructor
    //of a class
    //instance(non static) variable
    //'this' is a keyword and an implicit reference variable
    //of current type and current object
    // and is available inside non static method and constructor of class

    int a = 5;

    public void display() {

        System.out.println("this is: "+this);
        System.out.println(a);//this.a

        //local variable
        int a = 6;
        System.out.println(a);
        int sum = a + this.a;//6+5
        System.out.println(sum);
    }

    public static void main(String[] args) {

        ThisDemo1 ob = new ThisDemo1();
        System.out.println("ob is: "+ob);
        ob.display();

        System.out.println("=================");

        ThisDemo1 ob2 = new ThisDemo1();
        System.out.println("ob is: "+ob2);
        ob2.display();
    }
}
