package com.algorithm.day6;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepetition {
    //Hashtable
    //string
    //sliding window

    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> sCharIndex = new HashMap<>();
        int start=0;
        int stop=0;
        int max=0;

        while(stop<s.length()) {
            if(sCharIndex.containsKey(s.charAt(stop)) &&
                sCharIndex.get(s.charAt(stop))>=start) {
                max = Integer.max(max, stop-start);
                start= sCharIndex.get(s.charAt(stop))+1;
            }
            sCharIndex.put(s.charAt(stop),stop);
            stop++;
        }
        return max = Integer.max(max, stop-start);
    }

    @Test
    public void test1(){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        assert lengthOfLongestSubstring(s) == 3;
    }
    @Test
    public void test2(){
        String s = "aaaaa";
        System.out.println(lengthOfLongestSubstring(s));
        assert lengthOfLongestSubstring(s) == 1;
    }
    @Test
    public void test3(){
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        assert lengthOfLongestSubstring(s) == 3;
    }
    @Test
    public void test4(){
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
        assert lengthOfLongestSubstring(s) == 1;
    }
    @Test
    public void test5(){
        String s = "";
        System.out.println(lengthOfLongestSubstring(s));
        assert lengthOfLongestSubstring(s) == 0;
    }
    @Test
    public void test6(){
        String s = "ax";
        System.out.println(lengthOfLongestSubstring(s));
        assert lengthOfLongestSubstring(s) == 2;
    }
    @Test
    public void test7(){
        String s = "anhytgerdsf";
        System.out.println(lengthOfLongestSubstring(s));
        assert lengthOfLongestSubstring(s) == s.length();
    }

}
