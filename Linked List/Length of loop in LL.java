class Solution {
    public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                count = 1;
                ListNode temp = slow.next;

                while(temp != slow) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }
}
