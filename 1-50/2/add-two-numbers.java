/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// 只需要处理10+和最后的头部进一即可
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode result = res;
        int cf = 0;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                res.next = new ListNode((l2.val + cf) % 10);
                cf = (l2.val + cf) / 10;
                l2 = l2.next;
            }
            else if(l2 == null) {
                res.next = new ListNode((l1.val + cf) % 10);
                cf = (l1.val + cf) / 10;
                l1 = l1.next;
            }else {
                res.next = new ListNode((l1.val + l2.val + cf) % 10);
                cf = (l1.val + l2.val + cf) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            res = res.next;
        }
        if(cf == 1) res.next = new ListNode(1);
        return result.next;
    }
}
