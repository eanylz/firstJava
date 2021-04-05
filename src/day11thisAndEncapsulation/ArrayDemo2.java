package day11thisAndEncapsulation;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        float[] fl = new float[5];

        Scanner inp = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.println("enter the value of "+i+1+"th "+"element ");
            arr[i] = inp.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("The values are; "+arr[i]);
        }

    }
}
