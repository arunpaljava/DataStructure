package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IndexValueAdditionGetTargetNumber {

    public static void main(String s[]) {
        int[] array = {3, 7, 4, 15, 9};
        int k = 22;
        int[] indexes = getAdditionofTwoIndexValue(array, k);
        Arrays.stream(indexes).forEach(val -> System.out.println(val));
    }

    private static int[] getAdditionofTwoIndexValue(int[] arr, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = target - arr[i];
            if (intMap.containsKey(num) && intMap.get(num) != i) {
                return new int[]{intMap.get(num), i};
            }
            intMap.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

}
