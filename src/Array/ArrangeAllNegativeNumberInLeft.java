package Array;

public class ArrangeAllNegativeNumberInLeft {

    public static void main(String s[]) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int j = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
