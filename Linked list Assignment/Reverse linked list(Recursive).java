public class Solution {
    public ListNode reverseList(ListNode head) {
    	if(head == null){
            return head;
        }
    	ListNode next = head.next;
    	head.next = null;
    	
    	return recursive(head,next);
    }
    private ListNode recursive(ListNode head, ListNode next){
    	if(next == null){
            return head;
        }
    	ListNode temp = next.next;
    	next.next = head;
    	return recursive(next,temp);
    }
}
