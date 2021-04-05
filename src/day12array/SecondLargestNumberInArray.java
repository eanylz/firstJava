package day12array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumberInArray {

    public int [] takeInputInArray(Scanner input){
        System.out.println("Enter size in array");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Enter element of array");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public void findSecondLargestElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        SecondLargestNumberInArray ob = new SecondLargestNumberInArray();

        Scanner input = new Scanner(System.in);
        int[] ret = ob.takeInputInArray(input);
        ob.findSecondLargestElement(ret);


        }
    }

