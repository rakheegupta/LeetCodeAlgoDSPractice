package com.algorithm.day4;

import org.junit.Test;


public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++) {
            words[i] = reverseString1(words[i]);
        }
        return String.join(" ",words);
    }

    String reverseString(String word) {
        char[] chars = new char[word.length()];
        word.getChars(0,word.length(),chars,0);
        word = reverseString(chars);
        return word;
    }

    String reverseString1(String word) {
        word = new StringBuilder(word).reverse().toString();
        return word;
    }

    public String reverseString(char[] s) {
        char temp;
        int len = s.length;
        for(int i=0;i<s.length/2;i++) {
            temp = s[i];
            s[i]=s[len-1-i];
            s[len-1-i] = temp;
        }
        return new String(s);
    }

    @Test
    public void test1 () {
        String input="Let's take LeetCode contest";
        System.out.println(reverseWords(input));
    }
}
