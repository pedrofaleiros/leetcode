package solutions;

// https://leetcode.com/problems/add-two-numbers/
@SuppressWarnings("unused")
public class Solution2 {

    public ListNode addListNode(ListNode head, int value) {
        if (head == null) {
            return new ListNode(value);
        }

        ListNode curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new ListNode(value);

        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        int rest = 0;

        while (l1 != null || l2 != null || rest != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int sum = v1 + v2 + rest;

            rest = sum / 10;
            sum = sum % 10;

            head = addListNode(head, sum);

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return head;
    }

    public static void main(String[] args) {
        var solution = new Solution2();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        solution.addTwoNumbers(l1, l2);
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
