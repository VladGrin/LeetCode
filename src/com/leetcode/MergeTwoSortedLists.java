package com.leetcode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
//        Input: 1->2->4, 1->3->4
//        Output: 1->1->2->3->4->4
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution5 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = null;
        ListNode head = null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        while (l1 != null || l2 != null) {
            if ((l1!=null) && (l1.val <= l2.val || l2 == null)) {
                ListNode newNode = new ListNode(l1.val);
                if (node == null) {
                    head = newNode;
                    node = newNode;
                } else {
                    node.next = newNode;
                    node = newNode;
                }
                l1 = l1.next;
            } else {
                ListNode newNode = new ListNode(l2.val);
                if (node == null) {
                    head = newNode;
                    node = newNode;
                } else {
                    node.next = newNode;
                    node = newNode;
                }
                l2 = l2.next;
            }
        }
        node.next = null;
        return head;
    }
}
