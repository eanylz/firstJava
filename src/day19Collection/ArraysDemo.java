package day19Collection;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        Integer [] arr = {4,2,6,3,9};
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> li = Arrays.asList(4,5,6,7);
        System.out.println(li);

    }
}
