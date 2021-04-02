package day4;

public class LiteralsDemo {
    public static void main(String[] args) {
        //literals: fixed value+data type

        //1.Integer literal(by default int)
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l1 = 2147483647;
        long l2 = 214748364888L;

        //2. Floating literals (by default double)
        float f =23.45F;
        double d = 44.3;

        //3. Boolean Literals
        boolean b1 = true;
        boolean b2 = false;

        //4. Character Literals
        char c = 'a';
        char c2 = '1';
        char c3 = '\u0000';//unicode

        //5.String Literals
        String S1 = "Anil";
        String S2 = "abc123";
        String s4 = "face book";
        String s5 = "";
        String s6 = " ";

        //6. Null literals
        String s9 = null;
        LiteralsDemo ob = new LiteralsDemo();
        LiteralsDemo obj = null;




    }
}
