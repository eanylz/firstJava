package day19Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
    public static void main(String[] args) {
        System.out.println("using hash map");

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100,"Anil Sharma");
        studentMap.put(110,"Ram Lama");
        studentMap.put(115, "Krishna Nepal");
        studentMap.put(120, "Gopal Sharma");



        for(Map.Entry<Integer, String> s: studentMap.entrySet()){
            System.out.println(s.getKey()+ " " +s.getValue());
        }

        System.out.println("linked hash map");

        Map<Integer, String> studentMap2 = new LinkedHashMap<>();
        studentMap2.put(100,"Anil Sharma");
        studentMap2.put(110,"Ram Lama");
        studentMap2.put(115, "Krishna Nepal");
        studentMap2.put(120, "Gopal Sharma");



        for(Map.Entry<Integer, String> s: studentMap2.entrySet()){
            System.out.println(s.getKey()+ " " +s.getValue());
        }


        System.out.println("tree map");
        Map<Integer, String> studentMap3 = new TreeMap<>();
        studentMap3.put(100,"Anil Sharma");
        studentMap3.put(110,"Ram Lama");
        studentMap3.put(115, "Krishna Nepal");
        studentMap3.put(120, "Gopal Sharma");



        for(Map.Entry<Integer, String> s: studentMap3.entrySet()){
            System.out.println(s.getKey()+ " " +s.getValue());
        }
    }
}
