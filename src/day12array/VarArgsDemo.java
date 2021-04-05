package day12array;

public class VarArgsDemo {
    public static void display(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {4,3,5};
        VarArgsDemo.display(arr1);
        System.out.println("===============");

        VarArgsDemo.display(new int[]{1,2,3});
        System.out.println("===============");

        VarArgsDemo.display(2,4,5,6,7);
        VarArgsDemo.display(2,3,2,5);



    }

}


