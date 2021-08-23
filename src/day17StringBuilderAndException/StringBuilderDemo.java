package day17StringBuilderAndException;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s1 = "Good";
        System.out.println(s1);
        s1.concat("Morning");
        System.out.println(s1);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb);
        sb.append("Anil");
        System.out.println(sb);

        System.out.println("===========");

        StringBuffer sbf = new StringBuffer("Hello");//threadsafe
        System.out.println(sbf);
        sbf.append("Anil");
        System.out.println(sbf);
    }
}
