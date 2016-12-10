public class Solution {
   public int removeDuplicates(int[] nums) {
   
        int i=0;
        if(nums.length==0)
            i=-1;
   
        for(int n: nums)
        {
            if(n>nums[i])
            {
                nums[i+1]=n;
                i++;
            }
            
        }
        
        return i+1;
   
   
    }
}