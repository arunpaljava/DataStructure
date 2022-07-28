package priorityQueue;

import java.util.PriorityQueue;

public class FindKthLargestElementFromArray {
    public static void main(String args[]) {
        //by default java have min heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int[] nums = new int[]{15, 9, 11, 7, 8, 10};
        int k = 3;
        for (int i = 0; i < k; i++) {
            priorityQueue.add(Integer.valueOf(nums[i]));
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(Integer.valueOf(nums[i]));
            }
        }
        System.out.println(priorityQueue.peek());
    }
    //10,11,15
}
