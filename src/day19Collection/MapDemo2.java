package day19Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo2 {

    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100,"Anil Sharma");
        studentMap.put(110,"Ram Lama");
        studentMap.put(115, "Krishna Nepal");
        studentMap.put(120, "Gopal Sharma");

        for(Map.Entry<Integer, String> s: studentMap.entrySet()){
            System.out.println(s.getKey()+ " " +s.getValue());
        }
        System.out.println("======");
        studentMap.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println(key + " "+ value);

            }
        });
    }
}
