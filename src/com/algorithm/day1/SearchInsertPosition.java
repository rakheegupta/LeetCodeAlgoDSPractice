package com.algorithm.day1;

import org.junit.Test;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return binSearchInsert(nums,target,0,nums.length-1);
    }

    int binSearchInsert(int[] nums,int target,int start,int end) {
        int mid=0;
        while(start<=end) {
            mid = start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                end = mid-1;
            else
                start = mid+1;
        }
        return start;
    }

    @Test
    public void test1(){
        int [] nums= {1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums,target));
    }

    @Test
    public void test2(){
        int [] nums= {1,3,5,6};
        int target=2;
        System.out.println(searchInsert(nums,target));
    }

    @Test
    public void test3(){
        int [] nums= {1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums,target));
    }
}
