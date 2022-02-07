package com.algorithm.day4;

import org.junit.Test;

public class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        int len = s.length;
        for(int i=0;i<s.length/2;i++) {
            temp = s[i];
            s[i]=s[len-1-i];
            s[len-1-i] = temp;
        }
    }
    @Test
    public void test1(){
        char[] s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
}
