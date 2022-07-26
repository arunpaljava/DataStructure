package payu;

public class MaxSubarraySum {
    public static void main(String args[]) {
        int arr[] = {-47, 43, 94, -94, -93, -59, 31, -86};
        long max = new MaxSubarraySum().maxSubarraySum(arr, arr.length);
        System.out.println(max);

    }


    long maxSubarraySum(int arr[], int n) {

        int sum = -1;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Your code here
            currentSum = currentSum + arr[i];
            if (currentSum > sum) {
                sum = currentSum;
            } else if (currentSum < 0) {
                currentSum = 0;
            }
        }
        if (sum < 0) {
            return -1;
        }
        return sum;


    }
}
