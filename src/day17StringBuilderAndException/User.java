package day17StringBuilderAndException;

public class User {
    String name;

    public User(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        User user = new User("Ram");
        System.out.println(user);
        System.out.println(user.toString());

        String s = new String("Hello");
        System.out.println(s);
        System.out.println(s.toString());
    }
}
