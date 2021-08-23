package day21Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5, 2, 4, 1, 3);
//        for (int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }
        l.forEach(i -> System.out.print(i+" "));

//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        new Thread(() -> System.out.println("hello from thread")).start();

        l.sort((o1,o2)->
           {
                if (o1 > o2){
                    return 1;
                }else{
                    return -1;
                }
            }
        );
        System.out.println(l);


    }

}


