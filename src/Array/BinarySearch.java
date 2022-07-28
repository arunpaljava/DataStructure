package Array;

public class BinarySearch {

    public static void main(String arg[]) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(binarysearch(arr, k));
    }

    static int binarysearch(int arr[], int k) {
        // code here
        int i = 0;
        int n = arr.length;
        while (i <= n && i < arr.length) {
            int mid = (i + n) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (k > arr[mid]) {
                i = mid + 1;
            } else {
                n = mid - 1;
            }
        }
        return -1;
    }
}
