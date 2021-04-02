package day4;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        //implicit type cast
        byte b = 127;
        short s =b;
        int i = s;
        long l = s;
        float f = l;
        double d = f;
        System.out.println(b);
        System.out.println(s);

        System.out.println(i);

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

    }
}
