package day16String;

public class StringDemo4 {
    public static void main(String[] args) {
        String line = "Hello, I am Santosh Lal Karna, I am from Jaleshwor. I am a Java Developer. I am work as Java instructor, part tiem";
        String [] words = line.split(" ");
        for (String w: words) {
            System.out.println(w);
        }

        String s2 = "Hi";
        if(s2.matches("[H|h]ello|Hi")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
