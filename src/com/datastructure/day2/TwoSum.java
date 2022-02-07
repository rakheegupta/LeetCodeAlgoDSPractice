package com.datastructure.day2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numIndex= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            if(numIndex.containsKey(target - nums[i])) {
                return new int[]{i,numIndex.get(target - nums[i])};
            }
            numIndex.put(nums[i],i);
        }
        return null;
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
        int target=22;
        printArray(twoSum(nums,target));
    }
}
