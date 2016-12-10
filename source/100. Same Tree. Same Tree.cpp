/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        
        if( p==NULL||q==NULL){
            if(p==NULL&&q==NULL)
                return true;
            else
                return false;
        }   
            
            
            
        if( p->left==NULL&&p->right==NULL)
        {
            if(q->left==NULL&&q->right==NULL&&p->val==q->val)
                return true;
            else
                return false;
            
        }
         bool isSameOnLeft = isSameTree(p->left,q->left);
         bool isSameOnRight = isSameTree(p->right,q->right);
         bool isSameRoot = false;
         if(p->val==q->val)
            isSameRoot =true;   
         if(isSameOnLeft&&isSameOnRight&&isSameRoot)
            return true;
         else
            return false;
    }
};