package Array;

public class BinarySearch {

    public static void main(String arg[]) {
        int n = 5;
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int k =5;
        System.out.println(binarysearch(arr, n, k));
    }

    static int binarysearch(int arr[], int n, int k) {
        // code here
        int i = 0;
        while (i <= n && i<arr.length) {
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
