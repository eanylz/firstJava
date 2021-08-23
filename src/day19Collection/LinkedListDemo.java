package day19Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(40);
        al.add(30);
        System.out.println(al);
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));
        }
        System.out.println("=========");
        for(int a:al){
            System.out.println(a);
        }
        System.out.println("========");
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("========");
        ListIterator<Integer> lit = al.listIterator();
        while(lit.hasNext()){
            System.out.print(lit.next()+ " ");
        }
        System.out.println("=====");
        while(lit.hasPrevious()){
            System.out.print(lit.previous()+ " ");
        }
        System.out.println("====");
        al.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i);
            }
        });
    }
}

