package com.amazon.contest.day2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class SortEvenOdd {
    public int[] sortEvenOdd(int[] nums) {
        int len= nums.length;
        int evenLength= nums.length/2;
        if(len%2!=0)
            evenLength+=1;

        int[] even = new int[evenLength];
        for(int i=0;i<=nums.length/2;i++) {
            if(i*2>= nums.length)
                break;
            even[i]=nums[i*2];
        }

        Integer [] odd = new Integer[nums.length/2];
        for(int i=0;i<nums.length/2;i++) {
            if(i*2 +1 > nums.length)
                break;
            odd[i]=nums[i*2+1];
        }

        printArray(odd);
        printArray(even);

        Arrays.sort(even);
        Arrays.sort(odd, Collections.reverseOrder());

        printArray(odd);
        printArray(even);

        int i=0;
        while(i<= nums.length/2){
            if(i>=even.length)
                break;
            nums[i*2]=even[i];
            if(i>=odd.length)
                break;
            nums[i*2+1]=odd[i];
            i++;
        }
        return nums;
    }

    void printArray(Integer [] nums) {
        if(nums==null)
            return;
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
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
        int[] nums={5,39,33,5,12,27,20,45,14,25,32,33,30,30,9,14,44,15,3};
        printArray(sortEvenOdd(nums));

    }
}
