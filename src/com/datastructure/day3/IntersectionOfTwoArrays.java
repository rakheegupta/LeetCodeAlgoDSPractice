package com.datastructure.day3;

import org.junit.Test;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return intersect(nums2,nums1);

        int[] result=new int[nums1.length];
        int p1=0;

        Map<Integer, Integer> numFreq = new HashMap<>();

        for(int i=0;i< nums1.length;i++)
            numFreq.put(nums1[i],numFreq.getOrDefault(nums1[i],0)+1);

        for(int i=0;i<nums2.length;i++) {
            if(numFreq.containsKey(nums2[i]) && numFreq.get(nums2[i]) > 0 ) {
                result[p1++] = nums2[i];
                numFreq.replace(nums2[i],numFreq.get(nums2[i])-1);
            }
        }
        return Arrays.copyOfRange(result,0,p1);
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
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        printArray(intersect(nums1,nums2));
    }
}
