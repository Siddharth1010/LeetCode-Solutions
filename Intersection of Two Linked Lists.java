/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null || headB==null)
            return null;
        
        HashSet<ListNode> set=new HashSet<ListNode>();
        
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        
        while(headB!=null){
            if(set.contains(headB))
                return headB;
            
            headB=headB.next;
            
        }
        
        return null;
        
    }
}