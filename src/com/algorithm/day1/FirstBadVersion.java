package com.algorithm.day1;

import org.junit.Test;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        return binFirstBadVersion(1,n);
    }

    int binFirstBadVersion(int f,int n) {
        int mid = f + (n-f)/2;
        if(isBadVersion(mid)) {
            if (!isBadVersion(mid - 1))
                return mid;
            return binFirstBadVersion(f, mid - 1);
        }
        return binFirstBadVersion(mid+1,n);
    }

    boolean isBadVersion(int version) {
        if(version == badVersion)
            return true;
        return false;
    }

    int badVersion;
    @Test
    public void test1 (){
        badVersion=4;
        System.out.println(firstBadVersion(5));
    }
    @Test
    public void test2 (){
        badVersion=1;
        System.out.println(firstBadVersion(1));
    }
}
