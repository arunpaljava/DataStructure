package biz2credit;

import java.util.Arrays;

public class RemoveDuplicatesWithoutUsingSet {
    public static void main(String args[]){
        int [] nums = new int[] {2,3,2,3,4,1,1,4,4,5,5};
        int [] ans = new int[5];
        Arrays.sort(nums); //1,1,2,2,3,3,4,4,5,5
        int j=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            int num1 = nums[j];
            int num2 = nums[i];
            if(num1==num2){
                continue;
            } else{
                ans[index++]=nums[j];
                j=i;
            }
        }
        ans[index++]=nums[nums.length-1];
        for(int num : ans){
            System.out.println(num);
        }
    }
}
