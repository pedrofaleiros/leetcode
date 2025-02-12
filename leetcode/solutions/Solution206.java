package solutions;

// https://leetcode.com/problems/reverse-linked-list/submissions/1539241988/
@SuppressWarnings("unused")
public class Solution206 {

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

    public static void main(String[] args) {
        var solution = new Solution206();
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        var result = solution.reverseList(head);

        showList(head);
        showList(result);
    }

    public static void showList(ListNode head) {
        System.out.println("");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
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

