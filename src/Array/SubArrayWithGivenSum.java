package Array;

import java.util.stream.IntStream;

public class SubArrayWithGivenSum {

    public static void main(String s[]) {
        int[] array = {13, 10, 7, 5, 9, 1, 3, 6};
        int target = 15;
        int[] subArray = getSubArray(array, target);
        if (null != subArray) {
            for (int val : subArray) {
                System.out.println(val);
            }
        }
    }

    private static int[] getSubArray(int[] array, int target) {
        int currSum = 0;
        int start = 0;
        int[] ans = new int[3];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            currSum += array[i];
            while (currSum > target) {
                currSum -= array[start];
                start++;
            }
            if (currSum == target) {
                while (start <= i) {
                    ans[index++] = array[start++];
                }
            }
        }
        return ans;
    }


}
