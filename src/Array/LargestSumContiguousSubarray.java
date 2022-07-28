package Array;

public class LargestSumContiguousSubarray {
    public static void main(String args[]) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = getMaximumSubArraySum(arr);
        System.out.println(max);
    }

    private static int getMaximumSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

}
