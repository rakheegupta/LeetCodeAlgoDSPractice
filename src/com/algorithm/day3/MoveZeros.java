package com.algorithm.day3;

import org.junit.Test;

public class MoveZeros {
    public void moveZeroes1(int[] nums) {
        int p1=0,p2=0;
        while(p2<nums.length) {
            if(nums[p2]!=0) {
                nums[p1++]=nums[p2];
            }
            p2++;
        }
        while(p1<nums.length)
            nums[p1++]=0;
    }
    public void moveZeroes(int[] nums) {
        int p1=0;
        int p2=0;
        while(p2< nums.length) {
            if(nums[p2]!=0) {
                swap(nums, p1, p2);
                p1++;
            }
            p2++;
        }
    }
    void swap(int[] nums,int a,int b) {
        nums[a]=nums[a]+nums[b];
        nums[b]=nums[a]-nums[b];
        nums[a]=nums[a]-nums[b];
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
        int[] nums={0,1,0,3,12,0,6};
        moveZeroes(nums);
        printArray(nums);
    }
    @Test
    public void test2(){
        int[] nums={0,0,9,7,0,0,0,0,9};
        moveZeroes(nums);
        printArray(nums);
    }
}
