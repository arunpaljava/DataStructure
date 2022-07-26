import java.util.*;

public class SortMapByValueAndKey {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("arun","abc");
        map.put("me","rohit");
        map.put("ec","aarav");
        map.put("cs","saanvi");
        map.put("it","sumit");
        map.put("change","naman");
        map.put("puspa","cricket");

        //Sort by key
        TreeMap<String,String> treeMap = new TreeMap(map);
        System.out.println("Sort by key.............");
        for(String key : treeMap.keySet()){
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("Sort by value.............");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Comparator comparator = new Comparator() {

            @Override
            public int compare(Object entry1, Object entry2) {
                Map.Entry<String, String> entr1 = (Map.Entry<String, String>) entry1;
                Map.Entry<String, String> entr2 = (Map.Entry<String, String>) entry2;
                return entr1.getValue().compareTo(entr2.getValue());
            }
        };
        List<Map.Entry<String,String>> list = new ArrayList<>(entrySet);
        Collections.sort(list,comparator);
        Map<String,String> linkedHashMap = new LinkedHashMap(list.size());

        for(Map.Entry<String,String> setOfEntry : list){
            linkedHashMap.put(setOfEntry.getKey(),setOfEntry.getValue());

        }
        for (String key : linkedHashMap.keySet()){
            System.out.println(key + ":" + map.get(key));
        }



    }



}
