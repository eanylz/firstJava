package day14abstractandinterface;

public class Dog implements Animal, Breed{

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void nameOfBreed() {
        System.out.println("German Shepherd");
    }

}
