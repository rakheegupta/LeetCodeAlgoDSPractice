package com.algorithm.day5;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        int len = length(head);
        int cnt = 1;
        ListNode ptr=head;
        while (cnt<=len/2) {
            ptr=ptr.next;
            cnt++;
        }
        return ptr;
    }

    private int length(ListNode head) {
        int count=0;
        ListNode ptr = head;
        while(ptr != null) {
            ptr= ptr.next;
            count++;
        }
        return count;
    }
}
