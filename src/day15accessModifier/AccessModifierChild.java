package day15accessModifier;

public class AccessModifierChild extends AccessModifierDemo{

    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo(4);
        ob.publicMethod();
        ob.protectedMethod();
        ob.defaultMethod();
        //ob.privateMethod();
    }
}

//private only own class
//same package other class public, protected and default
//in different package, if no relation between classes---only public is accessible
    //if relation exixts, CHILD object can access protected
