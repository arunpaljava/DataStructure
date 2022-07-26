package Array;
import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumEqualsK {

    public static void main(String s[]){
        Integer [] arr = new Integer[] {3,9,-2,4,1,-7, 2,6,-5,8,-3,-7,6,2,1};
        int k=5;
        int count = getCountSubarraySumEqualsK(arr,k);
        System.out.println("Count = "+count);
    }

 private static int getCountSubarraySumEqualsK(Integer[] arr, int target) {
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i]; //3,12,10,14,15,8,10,16,11,17,14,7,13,15,16
            if(map.containsKey(sum-target)) {
                ans += map.get(sum - target);//3,
            }
            map.put(sum, map.get(sum) +1);
        }
        return ans;
        //map 3-1,12-1,10-2,14-1,15-2,8-1,16-1,11-1,17-1,14-1,7-1,13-1,
    }
}
