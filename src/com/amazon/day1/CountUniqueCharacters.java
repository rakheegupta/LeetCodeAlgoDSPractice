package com.amazon.day1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountUniqueCharacters {
    public int uniqueLetterString(String s) {
        int total =0;
        Map <Character, ArrayList<Integer>> indexes = new HashMap<Character,ArrayList<Integer>>();
        setupIndexes(indexes,s);

        int[] left = new int[s.length()];
        int[] right = new int[s.length()];
        computeLeftAndRight(indexes,left,right);

        for(int i=0;i<s.length();i++) {
            total += left[i]*right[i];
        }

        return total;
    }

    void computeLeftAndRight(Map<Character,ArrayList<Integer>> indexes,int[] left,int[] right) {
        for(char key : indexes.keySet()) {
            int prev = -1;
            int next;
            for(int i=0; i< indexes.get(key).size();i++ ) {
                int val = indexes.get(key).get(i);
                left[val] = val - prev;
                prev= val;
                if(i == indexes.get(key).size() -1)
                    next = left.length;
                else
                    next = indexes.get(key).get(i+1);
                right[val] = next - val;
            }
        }
    }

    void setupIndexes(Map<Character,ArrayList<Integer>> indexes,String s) {
        for(int i=0;i<s.length();i++) {
            if (indexes.containsKey(s.charAt(i))) {
                ArrayList<Integer> chIndexes = indexes.get(s.charAt(i));
                chIndexes.add(i);
                indexes.replace(s.charAt(i),chIndexes);
            } else {
                ArrayList<Integer> chIndexes = new ArrayList<Integer>();
                chIndexes.add(i);
                indexes.put(s.charAt(i),chIndexes);
            }
        }
    }

    @Test
    public void test1 (){
        String s ="8@#8";
        System.out.println(uniqueLetterString(s));
    }
}
