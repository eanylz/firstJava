package day18ThrowsAndCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        List<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(40);
        al1.add(30);
        System.out.println(al1);
        al1.add(60);
        System.out.println(al1);
        al1.add(2,25);
        System.out.println(al1);
        al1.set(3,35);
        System.out.println(al1);
        System.out.println(al1.get(3));
        System.out.println(al1.size());
        System.out.println(al1.indexOf(30));
        System.out.println(al1.isEmpty());
        //al1.clear();
        System.out.println(al1.contains(30));
        System.out.println(al1.remove(2));
        System.out.println(al1);

        System.out.println("===========");
        List<Integer> al2 = new ArrayList<>();
        al2.add(60);
        al2.addAll(al1);
        System.out.println(al2);
        al2.addAll(0,al1);
        System.out.println(al2);

        //al2.removeAll(al1);
        al2.retainAll(al1);
        System.out.println(al2);
    }
}
