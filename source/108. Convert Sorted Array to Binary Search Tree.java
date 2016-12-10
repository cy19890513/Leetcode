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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        
        return createTree(nums,0,nums.length-1);
        
    }
    
    public TreeNode createTree(int[] nums, int startIndex,int endIndex)
    {
        if(startIndex>endIndex)
            return null;
        int mid = (startIndex+endIndex)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=createTree(nums,startIndex,mid-1);
        node.right=createTree(nums,mid+1,endIndex);
        
        return node;
    }
    
}