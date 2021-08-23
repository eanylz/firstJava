package day19Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(60);
        s.add(40);
        s.add(30);
        s.add(40);
        System.out.print(s+" ");
        for (int i:s){
            System.out.print(i+" ");
        }

        System.out.println("=======");

        Iterator<Integer> it = s.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}

//cannot use listiterator