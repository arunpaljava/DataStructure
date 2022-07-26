package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElementFromArray {
    public static void main(String args[]) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int [] nums = new int[]{15,9,11,7,8,10};
        int k=2;
        for(int i=0;i<k;i++){
            priorityQueue.add(Integer.valueOf(nums[i]));
        }
        for (int i =k;i<nums.length;i++){
            if(nums[i]<priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(Integer.valueOf(nums[i]));
            }
        }
        System.out.println(priorityQueue.peek());
    }//9,8,7
}
