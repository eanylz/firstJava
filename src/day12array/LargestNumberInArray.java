package day12array;

import java.util.Scanner;

public class LargestNumberInArray {

    public int[] takeInputInArray(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public void largestNumberInArray(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest<arr[i]){
                largest = arr[i];
            }

        }
        System.out.println("largest is "+ largest);

    }




    public static void main(String[] args) {
        LargestNumberInArray ob = new LargestNumberInArray();
        int[] result =ob.takeInputInArray();

//        for (int i = 0; i <result.length ; i++) {
//            System.out.println(result[i]);
    ob.largestNumberInArray(result);
        }
    }

