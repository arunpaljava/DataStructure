package Array;

public class FindMedianSortedArrays {
    public static void main(String s[]) {
        int[] nums1 = new int[]{1, 2, 4, 6, 7, 8};
        int[] nums2 = new int[]{3, 5, 9, 10};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int mergeArray[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < nums1.length || j < nums2.length) {
            int num1 = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            int num2 = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;
            if (num1 < num2) {
                mergeArray[index++] = num1;
                i++;
            } else {
                mergeArray[index++] = num2;
                j++;
            }
        }
        int n = mergeArray.length;
        if (n % 2 == 0) {//if length is even like 1,2,3,4 then median is (2+3)/2;
            int mid = n / 2;
            int num1 = mergeArray[mid - 1];
            int num2 = mergeArray[mid];
            return (num1 + num2) / 2d;
        } else {
            return new Double(mergeArray[(n) / 2]);
        }
    }
}
