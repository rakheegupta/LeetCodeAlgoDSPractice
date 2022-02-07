package com.datastructure.day1;

import org.junit.Test;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int localMax=nums[0];
        for(int i=1;i<nums.length;i++) {
            localMax = Integer.max(localMax+nums[i] , nums[i]);
            max = Integer.max(max,localMax);
        }
        return max;
    }

    @Test
    public void test1() {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
