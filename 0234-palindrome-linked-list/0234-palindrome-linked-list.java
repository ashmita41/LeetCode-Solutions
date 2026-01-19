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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        ListNode curr = null;
        while(fast != null && fast.next != null){
            curr = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        curr.next = null;
        ListNode temp = slow;
        ListNode check = null;
        ListNode prev = null;
        while(temp != null) {
            check = temp.next;
            temp.next = prev;
            prev = temp;
            temp = check;
        }
        ListNode c = head;

        while (c != null && prev != null) {
            if(c.val != prev.val) return false;
            c = c.next;
            prev = prev.next;
        }
        return true;

    }
}