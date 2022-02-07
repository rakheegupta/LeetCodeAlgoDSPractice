package com.algorithm.day2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] temp = new int[k];
        int len = nums.length;
        for(int i=len-k,j=0;i<len;i++,j++)
            temp[j]=nums[i];
        for(int i=len-k-1,j=len-1;i>=0;i--,j--)
            nums[j]=nums[i];
        System.arraycopy(temp, 0, nums, 0, k);
    }
    public void rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k, nums.length);
    }

    void reverse(int[] nums,int start,int end) {
        int temp;
        for(int i=start;i<end/2;i++)
        {
            temp = nums[i];
            nums[i] = nums[end-1-i];
            nums[end-1-i] = temp;
        }
    }
    @Test
    public void test1() {
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        rotate1(nums,k);
        printArray(nums);
    }
    void printArray(int [] nums) {
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
    }
}
