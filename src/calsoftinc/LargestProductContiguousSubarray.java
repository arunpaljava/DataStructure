package calsoftinc;

public class LargestProductContiguousSubarray {

    public static void main(String args[]) {
        int arr[] =  {0, 6, 3, -10, 0, 2};
        int max = getMaximumSubArrayProduct(arr);
        System.out.println(max);
    }

    private static int getMaximumSubArrayProduct(int[] arr) {
        int maxProduct = 0;
        int currProduct = 1;
        for (int i = 0; i < arr.length; i++) {
            currProduct *= arr[i];
            if (currProduct > maxProduct) {
                maxProduct = currProduct;
            }
            if (currProduct == 0) {
                currProduct = 1;
            }
        }
        return maxProduct;
    }
}
