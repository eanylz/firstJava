package day13inheritance;

public class Car {
Engine engine;
    public Car() {
         engine = new Engine();
    }


    public void start() {
    engine.move();
        System.out.println("Car started");
    }

    public static void main(String[] args) {
    Car c = new Car();
    c.start();
    }
}


//inheritance-- is a
//association->aggregation and composition---has a
//https://www.youtube.com/watch?v=9nRblRcb35Y&ab_channel=SmartProgramming
