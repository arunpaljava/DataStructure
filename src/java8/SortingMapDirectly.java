package java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMapDirectly {

    public static void main(String args[]){
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("B", "b");
        map.put("Z", "z");
       // sortMapByKey(map);
        sortMapByValue(map);
    }

    private static void sortMapByValue(Map<String, String> map) {

        List<Map.Entry<String, String>> sortedByKey = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        sortedByKey.forEach(System.out::println);
    }

    private static void sortMapByKey(Map<String, String> map) {
        List<Map.Entry<String, String>> sortedByKey = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());
        sortedByKey.forEach(System.out::println);
    }
}
