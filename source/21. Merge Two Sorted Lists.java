/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode fakehead = new ListNode(0);
        ListNode temp=fakehead;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                temp.next=l1;
                l1=l1.next;
                //System.out.println(l2.val);
            }
            else
            {
                temp.next=l2;
                l2=l2.next;
                //System.out.println(l1.val);
            }
            temp = temp.next;
        }
        
        if(l1==null)
        {
            temp.next=l2;
            //System.out.println(l2.val);
        }
        if(l2==null)
        {
            temp.next=l1;
           // System.out.println(l1.val);
        }
        return fakehead.next;
    }
}