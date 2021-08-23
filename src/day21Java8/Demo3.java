package day21Java8;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100, "Ram");
        studentMap.put(110, "shyam");
        studentMap.put(120, "haru");
        studentMap.put(130, "gopu");

        for(Map.Entry<Integer, String> s:studentMap.entrySet()){
            System.out.println(s.getKey()+" "+s.getValue());
        }

        System.out.println("=========");

        studentMap.entrySet().forEach(m->{
            System.out.println(m.getKey()+" "+m.getValue());
        });

    }
}
