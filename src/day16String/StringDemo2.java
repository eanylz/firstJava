package day16String;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "Nepal";
        String s2 = "Nepal";
        String s3 = new String("Nepal");
        String s4 = new String("Nepal");

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//false

        System.out.println(s1.equals(s2));//true  compares the content
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//true

        String s5 = new String("nepal");
        System.out.println(s3.equals(s5));//false
        System.out.println(s3.equalsIgnoreCase(s5));//true
    }
}
