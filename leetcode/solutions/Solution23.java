package solutions;

// https://leetcode.com/problems/merge-k-sorted-lists/description/
public class Solution23 {

    // TODO: implementacao com merge lists

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;

        for (int i = 0; i < lists.length; i++) {
            ListNode curr = lists[i];
            while (curr != null) {
                head = addSorted(head, new ListNode(curr.val));
                curr = curr.next;
            }
        }

        return head;
    }

    private ListNode addSorted(ListNode head, ListNode newNode) {
        if (head == null) {
            head = newNode;
            return head;
        }

        ListNode curr = head;
        ListNode ant = null;

        while (curr.next != null && curr.val < newNode.val) {
            ant = curr;
            curr = curr.next;
        }

        if (curr.val >= newNode.val) {
            if (ant != null) {
                ant.next = newNode;
            } else {
                head = newNode;
            }
            newNode.next = curr;
        } else {
            curr.next = newNode;
        }

        return head;
    }

    @SuppressWarnings("unused")
    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


