package com.algorithm.day5;

public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = ListNode.length(head);
        int cnt = 1;

        //remove first node
        if (len - n == 0) {
            ListNode del = head;
            //delete(del);
            return head.next;
        }

        ListNode ptr = head;
        while (cnt < len - n ) {
            ptr= ptr.next;
            cnt++;
        }

        ptr.next = ptr.next.next;
        return head;
    }
}
