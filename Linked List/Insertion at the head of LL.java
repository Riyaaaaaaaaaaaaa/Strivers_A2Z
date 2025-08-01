class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode temp = new ListNode(X);
        temp.next = head;
        return temp;
    }
}
