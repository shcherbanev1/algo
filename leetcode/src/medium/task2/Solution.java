package medium.task2;

class ListNode {
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
}


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int memorized = 0;
        ListNode head = new ListNode();
        ListNode cur = head;
        while (l1 != null || l2 != null || memorized > 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
            }
            if (l2 != null) {
                sum += l2.val;
            }
            sum += memorized;

            if (sum >= 10) {
                memorized = sum / 10;
                sum = sum % 10;
            } else {
                memorized = 0;
            }
            cur.val = sum;
            if (l1 != null) {
                l1 = l1.next;
                if (l1 != null) {
                    cur.next = new ListNode();
                }
            }
            if (l2 != null) {
                l2 = l2.next;
                if (l2 != null) {
                    cur.next = new ListNode();
                }
            }
            if (memorized > 0) {
                cur.next = new ListNode();
            }
            cur = cur.next;
        }
        return head;
    }

}
