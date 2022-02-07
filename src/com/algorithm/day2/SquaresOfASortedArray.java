package com.algorithm.day2;

import org.junit.Test;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int left= 0 ;
        int right= nums.length-1;
        int [] result = new int[nums.length];
        int i=right;
        while(left<=right) {
            if(mod(nums[left])<mod(nums[right]))
                result[i--] = nums[right] * nums[right--];
            else
                result[i--]  =nums[left] * nums[left++];
        }
        return result;
    }
    int mod(int x) {
        if(x<0)
            return -x;
        return x;
    }

    @Test
    public void test1() {

    }
}
