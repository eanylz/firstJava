package day14abstractandinterface;

public abstract class Shape {

    public abstract void draw();
    public void paint(){
        System.out.println("shape is painted");
    }
    public Shape(){
        System.out.println("Shape's constructor");

    }


}
//cannot use final in abstract class because we cannot extend final class
//cannot use private in abstract method
//also not static
//cannot make object of abstract class