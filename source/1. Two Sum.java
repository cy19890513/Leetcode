public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length<2)
            return null;
        int pt1 = 0 , pt2 = 1;
        int pt1V,pt2V;
        
       // Arrays.sort(nums);
        for(pt1=0;pt1<nums.length;pt1++){
            pt1V = nums[pt1];
            for(pt2=pt1+1;pt2<nums.length;pt2++){
                pt2V = nums[pt2];
                if(pt1V+pt2V == target){
                    int[] result = {pt1,pt2};
                    return result;
                }
            }
        }
        
        return null;
    }
}
