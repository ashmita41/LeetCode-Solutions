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
class Solution {
    public int getDecimalValue(ListNode head) {
        int l = 0, ans = 0;
        ListNode temp = head;
        while (temp != null) {
            l++;
            temp = temp.next;
        }
        ListNode dummy = head;
        while (l != 0) {
            ans += (dummy.val * Math.pow(2, l - 1));
            l--;
            dummy = dummy.next;
        }

        return ans;
    }
}