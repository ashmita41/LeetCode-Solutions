# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        # Create a dummy node that points to head
        dummy = ListNode(0)
        dummy.next = head
        
        # Initialize current node to dummy
        current = dummy
        
        # Traverse the list
        while current.next:
            if current.next.val == val:
                # Skip the node with the target value
                current.next = current.next.next
            else:
                # Move to next node
                current = current.next
        
        # Return the next node of dummy, which is the new head
        return dummy.next
