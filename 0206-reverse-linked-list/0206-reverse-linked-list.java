/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        return helper(head);
    }
    
    static ListNode helper(ListNode head)
    {
        if(head == null)
            return null;
        ListNode prev = null;
        ListNode curr = head;
        if(curr.next==null)
        {
            curr.next = prev;
            return curr;
        }
        ListNode fwd = head.next;
        
        
        while(curr!=null)
        {
            
            curr.next = prev;
            prev = curr;
            curr = fwd;
            if(fwd!=null)
                fwd = fwd.next;
            
        }
        
        return prev;
    }
}