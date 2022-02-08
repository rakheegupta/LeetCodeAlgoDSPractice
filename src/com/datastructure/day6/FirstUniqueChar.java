package com.datastructure.day6;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        Map<Character,Integer> charIndex = new HashMap<Character,Integer>();
        for(int i=0;i< s.length();i++) {

        }
        return minimum(charIndex.values().toArray(new Integer[0]));
    }

    int minimum(Integer[] vals) {
        int min= vals[0];
        for(int i=1;i<vals.length;i++) {
            if(min > vals[i])
                min=vals[i];
        }
        return min;
    }

    @Test
    public void test1(){
        String s ="hello";
        System.out.println(firstUniqChar(s));
        assert (firstUniqChar(s) == 0);
    }
}
