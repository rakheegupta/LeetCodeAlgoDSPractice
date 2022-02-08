package com.algorithm.day5;

import org.junit.Test;


public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public ListNode middleNode1(ListNode head) {
        int len = ListNode.length(head);
        int cnt = 1;
        ListNode ptr=head;
        while (cnt<=len/2) {
            ptr=ptr.next;
            cnt++;
        }
        return ptr;
    }

    @Test
    public void test1() {

    }
}
