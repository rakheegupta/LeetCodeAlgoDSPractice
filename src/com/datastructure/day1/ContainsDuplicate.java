package com.datastructure.day1;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            if(numSet.contains(nums[i]))
                return true;
            numSet.add(nums[i]);
        }
        return false;
    }

    @Test
    public void test1(){
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    @Test
    public void test2(){
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    @Test
    public void test3(){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
