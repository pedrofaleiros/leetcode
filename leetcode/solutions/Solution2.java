package solutions;

// https://leetcode.com/problems/add-two-numbers/
public class Solution2 {

    // TODO: acabar
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int s1 = 0;
        int s2 = 0;

        int pow = 0;

        ListNode aux = l1;
        while (aux != null) {
            int value = (int) Math.pow(10, pow);

            s1 += value * aux.val;
            pow++;

            aux = aux.next;
        }

        pow = 0;
        aux = l2;
        while (aux != null) {
            int value = (int) Math.pow(10, pow);

            s2 += value * aux.val;
            pow++;

            aux = aux.next;
        }

        System.out.println(s1);
        System.out.println(s2);

        return null;
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
