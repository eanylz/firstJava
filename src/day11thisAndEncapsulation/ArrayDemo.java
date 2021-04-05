package day11thisAndEncapsulation;

public class ArrayDemo {

    public static void main(String[] args) {

//        <data type> [] <array name> = new <data type>[size]
        int[] arr = new int[3];
        float[] fl = new float[3];

        System.out.println(arr);//id given by proxy class
        System.out.println(fl);

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        System.out.println(arr[0]);

    }
}
