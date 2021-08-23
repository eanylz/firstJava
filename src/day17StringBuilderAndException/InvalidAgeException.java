package day17StringBuilderAndException;

public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String msg){
        super(msg);
    }

}
