/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 
 1->2->3->4->5
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dhead=new ListNode(0);
        dhead.next=head;
        
        ListNode fast=dhead;
        ListNode slow=dhead;
        
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next=slow.next.next;
        
        return dhead.next;
        
        
    }
}