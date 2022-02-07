package com.amazon.contest.day2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallestNumber {
    /*
    -10e15 <= num <= 10e15
     */
    public long smallestNumber(long num) {
        if(num==0)
            return 0;

        boolean neg = false;
        if(num<0) {
            neg = true;
            num*=-1;
        }

        ArrayList<Integer> numList = new ArrayList();
        while(num!=0) {
            numList.add((int) (num%10));
            num/=10;
        }

        Integer[] digits = numList.toArray(new Integer[0]);

        System.out.println("numlist is"+ numList);
        System.out.print("array is ");
        printArray(digits);

        if(neg)
            Arrays.sort(digits,Collections.reverseOrder());
        else {
            Arrays.sort(digits);

            //swap first non zero
            if(digits[0]==0)
            {
                for(int i=0;i<digits.length;i++) {

                    if(digits[i]!=0) {
                        digits[0] = digits[i];
                        digits[i]=0;
                        break;
                    }
                }
            }
        }
        System.out.print("array is ");
        printArray(digits);


        for(int i=0;i<digits.length;i++) {
            num*=10;
            num+=digits[i];
        }
        System.out.println("final num - "+num);
        if(neg)
            return num*=-1;
        return num;
    }

    void printArray(Integer [] nums) {
        if(nums==null)
            return;
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
    }

    @Test
    public void test1(){
        long num=31;
        System.out.println(smallestNumber(num));
    }
}
