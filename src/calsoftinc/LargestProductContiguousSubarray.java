package calsoftinc;

public class LargestProductContiguousSubarray {

    public static void main(String args[]) {
        int arr[] = {-8, 5, 3, 1, 6};
        long max = getMaximumSubArrayProduct(arr);
        System.out.println(max);
    }

    private static long getMaximumSubArrayProduct(int[] arr) {
        // code here
        long product = 1;
        long max1 = Integer.MIN_VALUE;
        long max2 = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            product *= arr[i];
            if (product > max1) {
                max1 = product;
            }
            if (product == 0) {
                product = 1;
            }
        }
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product *= arr[i];
            if (product > max2) {
                max2 = product;
            }
            if (product == 0) {
                product = 1;
            }
        }
        return Math.max(max1, max2);
    }
}
