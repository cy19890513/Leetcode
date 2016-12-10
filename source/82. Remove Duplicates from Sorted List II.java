/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode fakeHead = new ListNode(0);
        ListNode prev = fakeHead;
        fakeHead.next = head;
        ListNode curr = head;
        
        //check curr and next
        //if duplicate remove curr and curr next.
        //prev next = curr next next
        //
        
        while(curr!=null&&curr.next!=null)
        {
            System.out.println("Curr val is "+curr.val+"Curr next val is"+curr.next.val);
            if(curr.val==curr.next.val){
               
                    while(curr.next.next!=null&&curr.next.val==curr.next.next.val)
                    {
                        curr.next=curr.next.next;
                        
                    }
                
                
                prev.next = curr.next.next;
                curr = prev.next;
            } 
            else
            {
                prev=prev.next;
                curr=curr.next;
            }
                
                
        }
        
        
        
        return fakeHead.next;
        
    }
}