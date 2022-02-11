package com.datastructure.day6;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
        setupFreq(s,charFreq);
        return findFirstUniq(s,charFreq);
    }

    void setupFreq(String s, Map<Character,Integer> charFreq){
        for(int i=0;i< s.length();i++) {
            charFreq.put(s.charAt(i),charFreq.getOrDefault(s.charAt(i),0)+1);
        }
    }

    int findFirstUniq(String s, Map<Character,Integer>charFreq) {
        for(int i=0;i<s.length();i++) {
            if(charFreq.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }

    @Test
    public void test1(){
        String s ="hello";
        System.out.println(firstUniqChar(s));
        assert (firstUniqChar(s) == -1);
    }
}
