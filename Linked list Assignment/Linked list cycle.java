public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        while (node != null) {
            if (node.next == head) {
                return true;
            }
            ListNode next = node.next;
            node.next = head;
            node = next;
        }
        return false;
    }
}
