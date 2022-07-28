package lrucache;

import java.util.Iterator;
import java.util.Map;

public class Client {
    public static void main(String args []) {
        LRUCache lruCache = new LRUCache(4);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);
        lruCache.put(4,40);
        lruCache.put(5,50);
        lruCache.put(7,60);
        lruCache.put(7,80);
        Iterator<Map.Entry<Integer, Node>> iterator = lruCache.map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, Node> next = iterator.next();
            System.out.println(next.getValue().key+","+next.getValue().value);
        }

    }
}
