package day16String;

public class StringDemo1 {
    public static void main(String[] args) {

        //Implicit creation
        String s1 = "Hello";
        System.out.println(s1);

        //Explicit creation
        String s2 = new String();
        System.out.println(s2);

        String s3 = new String("Hello");
        System.out.println(s3);

        char [] ch = {'d','e','f'};
        String s4 = new String(ch);
        System.out.println(s4);

        byte [] bb = {65,66,67};
        String s5 = new String(bb);
        System.out.println(s5);
    }

}
