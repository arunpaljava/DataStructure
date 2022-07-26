package freecharge;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question1 {
    /*Question-1
            return indices of the two numbers such that they add up to target.
    INPUT nums--[3,4,6,9,11] , target -->15

    out {1,4}
    {2,3}*/
    public static void main(String s[]) {
        int nums[] = new int[]{3, 4, 6, 9, 11};
        int target = 15;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i< nums.length;i++){
            int element=nums[i];
            if(map.containsKey(target-element) && map.get(target-element)!=i){
                System.out.println(map.get(target-element)+","+i);
            }
            map.put(element,i);
        }
    }



}
