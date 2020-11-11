/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        fast=head;
        slow=reversed(slow);
        
        while(slow!=null){
            if(slow.val!=fast.val){
                return false;
            }
            else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        
        return true;
        
    }
    
    public static ListNode reversed(ListNode head){
        ListNode prev=null;
        
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}