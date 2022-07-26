package com.java.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IterateOverMapEasilyWithForEach {

    public static void main(String args[]){
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("B", "b");
        map.put("Z", "z");
        map.forEach((k,v)->System.out.println("Key : -"+k+" Value : - "+v));
    }


}
