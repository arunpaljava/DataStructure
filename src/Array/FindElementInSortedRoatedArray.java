package Array;

public class FindElementInSortedRoatedArray {

    public static void main(String s[]) {
        int[] array = {15, 17, 18, 19, 5, 6, 7, 8, 10, 12};
        int k = 19;
        int elementIndex = bSearch(array, k);
        System.out.println("Index of " + k + " is " + elementIndex);
    }

    private static int bSearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[low] < arr[mid]) {
                //left part should be sorted
                if (k >= arr[low] && k < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                //Right part should be sorted
                if (k > arr[mid] && k <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return -1;
    }
}
