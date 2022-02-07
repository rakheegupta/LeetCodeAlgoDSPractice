package com.datastructure.day2;

import org.junit.Test;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int i = nums1.length-1;
        while ( n > -1 && m > -1 ) {
            if (nums1[m] > nums2[n])
                nums1[i--]=nums1[m--];
            else
                nums1[i--]=nums2[n--];
        }
        if(n>-1)
            System.arraycopy(nums2,0,nums1,0,n+1);
    }
    void printArray(int [] nums) {
        if(nums==null)
            return;
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
    }
    @Test
    public void test1(){
        int [] nums1 = {11,12,0,0};
        int [] nums2 = {1,2};
        int n=2,m=2;
        merge(nums1,m,nums2,n);
        printArray(nums1);
    }
}
