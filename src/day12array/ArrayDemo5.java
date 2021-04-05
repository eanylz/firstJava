package day12array;

import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {

        final int ROW = 3;
        final int COLUMN = 3;
        int [][] arr = new int[ROW][COLUMN];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.println("enter ");
                arr[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");

        }
    }
}
