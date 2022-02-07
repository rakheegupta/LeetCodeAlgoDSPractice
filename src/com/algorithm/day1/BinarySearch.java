package com.algorithm.day1;

import org.junit.Test;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return binSearchRec(nums,target,0,nums.length-1);
    }

    int binSearch(int[] nums,int target,int start,int end) {
        int mid=0;
        while (start<=end) {
            mid = start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                end=mid-1;
            else
                start= mid+1;
        }
        return -1;
    }
    int binSearchRec(int[] nums,int target,int start,int end) {
        if (start > end)
            return -1;
        int mid = start + ( end - start ) /2;
        if (nums[mid]== target)
            return mid;
        if (nums[mid]>target)
            return binSearchRec(nums,target,start,mid-1);
        return binSearchRec(nums,target,mid+1,end);
    }

    @Test
    public void test1 () {
        int[] nums={-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
    @Test
    public void test2() {
        int[] nums={-1,0,3,5,9,12};
        int target = 2;
        System.out.println(search(nums,target));
    }
    @Test
    public void test3() {
        int[] nums={-1};
        int target = -1;
        System.out.println(search(nums,target));
    }
}
