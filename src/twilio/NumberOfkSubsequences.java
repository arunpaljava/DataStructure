package twilio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NumberOfkSubsequences {
    public static void main(String s[]) {
        List<Integer> list = new ArrayList<>();//3
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        System.out.println(kSub(3, list));

    }
    public static long kSub(int k, List<Integer> nums) {
        // Write your code here
        int ans=0;
        int sum=0;
        int rem=0;
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.size();i++){//
            sum+=nums.get(i); //3
            rem = sum%k;
            if(rem < 0) {
                rem+=k;
            }
            if(map.containsKey(rem)){
                ans+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else {
                map.put(rem,1);
            }
        }
        return ans;


    }
}
