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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int[] ans = new int[values.size()];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < values.size(); i++) {
            while (!stack.isEmpty() && values.get(i) > values.get(stack.peek())) {
                int index = stack.pop();
                ans[index] = values.get(i);
            }
            stack.push(i);
        }

        return ans;
    }
}
