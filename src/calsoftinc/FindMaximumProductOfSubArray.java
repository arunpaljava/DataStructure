package calsoftinc;

public class FindMaximumProductOfSubArray {

    public static void main(String args[]) {
        int arr[] = {0, 6, -3, -10, 0, 2};
        int max = maxSubarrayProduct(arr);
        System.out.println(max);

    }

    private static int maxSubarrayProduct(int arr[]) {
        int n = arr.length;
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                max_ending_here = max_ending_here * arr[i];
                min_ending_here = Math.min(min_ending_here * arr[i], 1);
                flag = 1;
            } else if (arr[i] == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr[i], 1);
                min_ending_here = temp * arr[i];
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }

        if (flag == 0 && max_so_far == 0)
            return 0;
        return max_so_far;
    }
}
