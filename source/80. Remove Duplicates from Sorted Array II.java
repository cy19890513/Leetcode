public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,count=1,dupCount=0;
        
        if(nums == null)
            return 0;
        if(nums.length<2)
            return nums.length;
            
        
            
        for(int n:nums)
        {   
            if(i==0){}
            else
            {
                if(nums[i-1]==n)
                    count++;
                else
                    count=1;
            }
            
            if(count<3)
            {
                nums[i]=n;
                i++;
            }
            else
            {
                dupCount++;
            }
        }
        
        return nums.length-dupCount;
        
    }
}