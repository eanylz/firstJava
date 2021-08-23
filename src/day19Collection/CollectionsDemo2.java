package day19Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(40);
        al.add(30);
        System.out.println(al);
        al.add(80);
        System.out.println(al);

        List<Integer> ul = Collections.unmodifiableList(al);
        System.out.println(ul);
        //ul.add(5);
    }
}
