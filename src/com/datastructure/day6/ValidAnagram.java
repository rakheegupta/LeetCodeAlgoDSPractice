package com.datastructure.day6;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    //Hashtable String Sorting
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] freq = new int[26];
        for(char ch : s.toCharArray())
            freq[ch-'a']++;
        for(char ch: t.toCharArray())
            freq[ch-'a']--;
        for (int j : freq)
            if (j != 0)
                return false;
        return true;
    }

    public boolean isAnagramHashMap(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> sCharFreq = new HashMap<Character,Integer>();
        setupFreq(s,sCharFreq);
        return containsAll(t,sCharFreq);
    }
    
    boolean containsAll(String secondString,Map<Character,Integer> firstCharFreq) {
        for(char ch : secondString.toCharArray()) {
            if(!firstCharFreq.containsKey(ch))
                return false;
            if(firstCharFreq.get(ch) == 0)
                return false;
            firstCharFreq.replace(ch,firstCharFreq.get(ch)-1);
        }
        return true;
    }

    void setupFreq(String s, Map<Character,Integer> charFreq){
        for(int i=0;i< s.length();i++) {
            charFreq.put(s.charAt(i),charFreq.getOrDefault(s.charAt(i),0)+1);
        }
    }
    @Test
    public void test1(){
        String a="hello";
        String b="loehe";
        System.out.println(isAnagram(a,b));
    }
}
