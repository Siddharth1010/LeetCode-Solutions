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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        
        ListNode head1=head.next;
        ListNode head2=head;
        
        while(head!=null && head.next!=null && head.next.next!=null){
            ListNode temp=head.next;
            head.next=head.next.next;
            temp.next=head.next.next;
            head=head.next;
        }
        
        head.next=head1;
        
        return head2;
        
    }
}