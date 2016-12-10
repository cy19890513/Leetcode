/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    private ListNode node;
    
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
		return null;
	    }
        
        int size = 0;
        ListNode curr = head;
        
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        
        node =head;
        
        
        
        return listToTree(0,size-1);
        
    }
    
    public TreeNode listToTree(int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode left =listToTree(start,mid-1);
        
        TreeNode treenode=new TreeNode(node.val);
        treenode.left = left;
        node = node.next;
        
        TreeNode right =listToTree(mid+1,end);
        treenode.right =right;
        
        
        
        
        return treenode;
        
        
    }
    
}