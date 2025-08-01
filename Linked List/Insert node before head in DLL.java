class Solution {
    public ListNode insertBeforeHead(ListNode head, int X) {
        ListNode temp = new ListNode(X);
        temp.next= head;
        if(head != null) {
            head.prev = temp;
        }
        return temp;
    }
}
