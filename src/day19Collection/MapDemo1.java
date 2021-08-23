package day19Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100,"Anil Sharma");
        studentMap.put(110,"Ram Lama");
        studentMap.put(115, "Krishna Nepal");
        studentMap.put(120, "Gopal Sharma");

        System.out.println(studentMap.get(100));
        System.out.println(studentMap.get(110));
        System.out.println(studentMap.get(115));
        System.out.println(studentMap.get(120));

        System.out.println(studentMap.containsValue("Anil Sharma"));
        System.out.println(studentMap.containsKey(110));
        System.out.println(studentMap.size());
        System.out.println(studentMap);
        System.out.println(studentMap.replace(100, "wow"));

    }

}
