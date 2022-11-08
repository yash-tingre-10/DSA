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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int sum=0,carry=0;
    
        ListNode l3 = new ListNode();
        ListNode temp = l3;
        while(l1!=null && l2!=null)
        {
            
            sum=l1.val+l2.val+carry;
            carry=0;
            carry=sum/10;
            if(carry>0)
            {
                ListNode node = new ListNode(sum%10);
                temp.next=node;
            }
            else
            {
                ListNode node = new ListNode(sum);
                temp.next=node;
            }
            temp = temp.next;
            l1=l1.next;
            l2=l2.next;
             
        }
        
        while(l1!=null)
        {
            sum=l1.val+carry;
            carry=0;
            carry=sum/10;
            if(carry>0)
            {
                ListNode node = new ListNode(sum%10);
                temp.next=node;
            }
            else
            {
                ListNode node = new ListNode(sum);
                temp.next=node;
            }
            l1=l1.next;
            temp=temp.next;
        }
        
        
        while(l2!=null)
        {
            sum=l2.val+carry;
            carry=0;
            carry=sum/10;
            if(carry>0)
            {
                ListNode node = new ListNode(sum%10);
                temp.next=node;
            }
            else
            {
                ListNode node = new ListNode(sum);
                temp.next=node;
            }
            l2=l2.next;
            temp=temp.next;
        }
        
        if(carry>0)
        {
            ListNode node = new ListNode(carry);
            temp.next=node;
            temp=temp.next;
        }    
        
        
        return l3.next;
        
    }
}