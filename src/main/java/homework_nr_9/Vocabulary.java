package homework_nr_9;

import java.util.*;

public class Vocabulary {
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("Mama", "Mother");
        stringMap.put("Girafa", "Giraffe");
        stringMap.put("Atentie", "Careful");
        stringMap.put("Amintire", "Memory");
        stringMap.put("Intersectie", "Intersection");
        stringMap.put("Indicator", "Indicator");
        stringMap.put("Regula", "Rule");
        stringMap.put("Masina", "Car");
        stringMap.put("Bicicleta", "Bicycle");
        stringMap.put("Viata", "Life");

    Set<String> keySet = stringMap.keySet();
    List<String> valueEng = new ArrayList<>(stringMap.values());

    System.out.println(keySet);
    System.out.println(valueEng);

    }
}
