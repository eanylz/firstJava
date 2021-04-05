package day11thisAndEncapsulation;

public class ThisDemo2 {

    String name;
    int age;

    public ThisDemo2(String name, int age){
        this.name=name;
        this.age=age;

    }

    public void displayInfo(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);

    }

    public static void main(String[] args) {
        ThisDemo2 ob = new ThisDemo2("Ram", 22);
        ob.displayInfo();

    }
}
