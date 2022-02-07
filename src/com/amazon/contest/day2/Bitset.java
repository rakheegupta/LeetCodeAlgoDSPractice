package com.amazon.contest.day2;

/*
A Bitset is a data structure that compactly stores bits.

Implement the Bitset class:

Bitset(int size) Initializes the Bitset with size bits, all of which are 0.
void fix(int idx) Updates the value of the bit at the index idx to 1. If the value was already 1, no change occurs.
void unfix(int idx) Updates the value of the bit at the index idx to 0. If the value was already 0, no change occurs.
void flip() Flips the values of each bit in the Bitset. In other words, all bits with value 0 will now have value 1 and vice versa.
boolean all() Checks if the value of each bit in the Bitset is 1. Returns true if it satisfies the condition, false otherwise.
boolean one() Checks if there is at least one bit in the Bitset with value 1. Returns true if it satisfies the condition, false otherwise.
int count() Returns the total number of bits in the Bitset which have value 1.
String toString() Returns the current composition of the Bitset. Note that in the resultant string, the character at the ith index should coincide with the value at the ith bit of the Bitset.


 */
public class Bitset {
    int[] bits;

    public Bitset(int size) {
        bits= new int[size];
    }

    public void fix(int idx) {
        bits[idx]=1;
    }

    public void unfix(int idx) {
        bits[idx]=0;
    }

    public void flip() {
        for(int i=0;i<bits.length;i++)
        {
            if (bits[i]==1)
                bits[i]=0;
            else if(bits[i]==0)
                bits[i]=1;
        }
    }

    public boolean all() {
        for(int i=0;i<bits.length;i++)
        {
            if(bits[i]==0)
                return false;
        }
        return true;
    }

    public boolean one() {
        for(int i=0;i<bits.length;i++) {
            if (bits[i] == 1)
                return true;
        }
        return false;
    }

    public int count() {
        int count = 0;
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == 1)
                count++;
        }
        return count;
    }

    public String toString() {
        StringBuilder bitsStr=new StringBuilder();
        for (int i = 0; i < bits.length; i++) {
            bitsStr.append(bits[i]);
        }
        return  bitsStr.toString();
    }
}
