package java8;

import java.util.HashMap;
import java.util.Map;

public class ReplaceAndRemoveUtilities {

    public static void main(String args[]){
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("B", "b");
        map.put("Z", "z");
        map.replaceAll((k,v)->"x");
        map.forEach((k,v)->System.out.println("key : "+k+" value : "+v));
    }


}
