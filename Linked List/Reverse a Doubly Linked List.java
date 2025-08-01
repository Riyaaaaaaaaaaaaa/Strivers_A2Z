//Iterative Approach
class Solution {
    public ListNode reverseDLL(ListNode head) {
        // Your code goes here
        if(head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode temp = null;

        while(curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp != null) {
            head = temp.prev;
        }
        return head;
    }
}


//Recursive Approach
class Solution {
    public ListNode reverseDLL(ListNode head) {
        if (head == null || head.next == null) return head;

        // Swap prev and next
        ListNode temp = head.prev;
        head.prev = head.next;
        head.next = temp;

        // If the new prev is null, we've reached the end (new head)
        if (head.prev == null) return head;

        // Recursive call on the next node (originally next, now prev)
        return reverseDLL(head.prev);
    }
}
