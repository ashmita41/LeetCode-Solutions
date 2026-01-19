class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        int cnt = 1;
        ListNode temp = head;
        ListNode odd = null;
        ListNode even = null;

        while (temp != null) {
            ListNode next = temp.next; 

            if (cnt % 2 == 1) {
                temp.next = odd;
                odd = temp;
            } else {
                temp.next = even;
                even = temp;
            }

            temp = next;
            cnt++;
        }

        odd = reverseLL(odd);
        even = reverseLL(even);

        ListNode t = odd;
        while (t.next != null) {
            t = t.next;
        }
        t.next = even;

        return odd;
    }

    public ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
