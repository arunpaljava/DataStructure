package coforge;

public class FIndSecondHighestNumberFromIntArray {
    public static void main(String args[]) {
        int[] nums = new int[]{1, 8, 11, 7, 8, 9};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println(first);
        System.out.println(second);


    }
}
