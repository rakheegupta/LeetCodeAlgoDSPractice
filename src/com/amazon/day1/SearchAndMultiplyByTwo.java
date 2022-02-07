package com.amazon.day1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class SearchAndMultiplyByTwo {
    public int findFinalValue(int[] nums, int original) {
        boolean found = false;
        ArrayList<Integer> originalPowers = new ArrayList<>();
        for ( int i=0;i< nums.length;i++) {
            if (fitsCriteria(nums[i],original)) {
                originalPowers.add(i);
            }
        }

        return original;
    }

    boolean fitsCriteria(int num,int original){
        boolean fits=true;

        if(num%original !=0)
            return false;
        num/=original;
        double power = Math.log(num) / Math.log(2);
        if(power - (int)power > 1e-5)
            return false;

        return fits;
    }

    @Test
    public void test1() {
        int[] nums={1,2,4,8};
        int or=1;
        System.out.println(findFinalValue(nums,or));
    }
}
