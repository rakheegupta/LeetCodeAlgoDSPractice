package com.algorithm.day5;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static int length(ListNode head) {
        int count=0;
        ListNode ptr = head;
        while(ptr != null) {
            ptr= ptr.next;
            count++;
        }
        return count;
    }
}
