class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf;
        if(fast == null) {
            secondHalf = reverse(slow);
        } else {
            secondHalf = reverse(slow.next);
        }
        ListNode firstHalf = head;

        while(secondHalf != null) {
            if(firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;

        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
