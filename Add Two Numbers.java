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
        
        ListNode head=new ListNode(-1);
        ListNode head1=head;
        // head1.next=head;
        int carry=0;
        
        while(l1!=null && l2!=null ){
            
            int sum=0;
            if(carry==0){
                sum=l1.val+l2.val;
                if(sum>=10){
                    sum-=10;
                    carry=1;
                }
                ListNode node=new ListNode(sum);
                head.next=node;
                head=head.next;
            }
            
            else if(carry==1){
                sum=l1.val+l2.val+1;
                carry=0;
                if(sum>=10){
                    sum-=10;
                    carry=1;
                }
                ListNode node1=new ListNode(sum);
                head.next=node1;
                head=head.next;
            }
            
            l1=l1.next;
            l2=l2.next;
            
        }
        
        while(l1!=null){
            int sum=0;
        
            if(carry==1){
                sum=l1.val+carry;
                carry=0;
                if(sum>=10){
                    sum-=10;
                    carry=1;
                }
                ListNode node=new ListNode(sum);
                head.next=node;
                head=head.next;
            }
            else{
                ListNode node1=new ListNode(l1.val);
                head.next=node1;
                head=head.next;
            }
            
            l1=l1.next;
            
        }
        
        while(l2!=null){
            int sum=0;
            if(carry==1){
                sum=l2.val+carry;
                carry=0;
                if(sum>=10){
                    sum-=10;
                    carry=1;
                }
                ListNode node=new ListNode(sum);
                head.next=node;
                head=head.next;
            }
            else{
                ListNode node1=new ListNode(l2.val);
                head.next=node1;
                head=head.next;
            }
            
            l2=l2.next;
            
        }
        
        if(carry==1){
            ListNode node=new ListNode(1);
                head.next=node;
                head=head.next;
        }
        
        
        
        return head1.next;
        
    }
}