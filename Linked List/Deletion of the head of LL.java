class Solution {
    public ListNode deleteHead(ListNode head) {
        if(head == null) return null;
        return head.next;
    }
}
