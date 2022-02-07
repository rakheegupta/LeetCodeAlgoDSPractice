package com.algorithm.day3;

import org.junit.Test;

public class TwoSumIIArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1,-1};
        int low=0;
        int high= numbers.length-1;
        while(low<high) {
            long sum= (long)(numbers[low]+numbers[high]);
            if(sum == target){
                result[0]=low+1;
                result[1]=high+1;
                return result;
            }
            if(sum > target)
                high--;
            else
                low++;
        }
        return result;
    }

    void printArray(int [] nums) {
        if(nums==null)
            return;
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
    }

    @Test
    public void test1() {
        int [] nums={2,7,11,15};
        int target=9;
        printArray(twoSum(nums,target));
    }

    @Test
    public void test2() {
        int [] nums={2,3,4};
        int target=6;
        printArray(twoSum(nums,target));
    }

    @Test
    public void test3() {
        int [] nums={-1,0};
        int target=-1;
        printArray(twoSum(nums,target));
    }
}
