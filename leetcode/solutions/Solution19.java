package solutions;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1539268037/
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode aux = new ListNode(0, head);
        ListNode left = aux;
        ListNode right = head;

        while (n > 0 && right != null) {
            right = right.next;
            n--;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return aux.next;
    }

    /*
     * public ListNode removeNthFromEnd(ListNode head, int n) { head = reverseList(head);
     * 
     * ListNode prev = null; ListNode curr = head; ListNode next = curr.next;
     * 
     * n--; while (n > 0) { prev = curr; curr = next; next = curr.next; n--; }
     * 
     * if (prev == null) { head = head.next; } else { prev.next = next; }
     * 
     * return reverseList(head); }
     */

    public ListNode reverseList(ListNode head) {
        ListNode list = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = list;
            list = head;
            head = next;
        }

        return list;
    }

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

