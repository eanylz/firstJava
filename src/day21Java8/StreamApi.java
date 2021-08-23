package day21Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5, 2, 4, 1, 3, 6, 7, 8);

        List<Integer> eList = l.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(eList);


        List<Integer> evenList = new ArrayList<>();
        for(int a:l){
            if(a%2==0){
                evenList.add(a);
            }
        }
        System.out.println(evenList);
    }
}
