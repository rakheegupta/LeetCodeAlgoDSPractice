package com.datastructure.day6;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RansomNoteFromMagazine {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> magazineCharFreq = new HashMap<>();
        setupFreq(magazine,magazineCharFreq);

        return containsAll(ransomNote,magazineCharFreq);
    }
    boolean containsAll(String ransomNote,Map<Character,Integer> magazineCharFreq) {
        for(char ch : ransomNote.toCharArray()) {
            if(!magazineCharFreq.containsKey(ch))
                return false;
            if(magazineCharFreq.get(ch) == 0)
                return false;
            magazineCharFreq.replace(ch,magazineCharFreq.get(ch)-1);
        }
        return true;
    }

    void setupFreq(String s, Map<Character,Integer> charFreq){
        for(int i=0;i< s.length();i++) {
            charFreq.put(s.charAt(i),charFreq.getOrDefault(s.charAt(i),0)+1);
        }
    }

    @Test
    public void test1() {
        String ransom = "abba";
        String mag = "aab";
        assert canConstruct(ransom,mag);
    }
}
