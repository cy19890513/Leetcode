public class Solution {
    public void sortColors(int[] nums) {
        //int pointer1=0,pointer2=nums.length,temp;
        
        int second=nums.length-1, zero=0,temp;
            for (int i=0; i<=second; i++) {
                while (nums[i]==2 && i<second) 
                {
                    temp= nums[second];
                    nums[second]=2;
                    nums[i]=temp;
                    second--;
                }
                
                while (nums[i]==0 && i>zero)
                {
                    temp=nums[zero];
                    nums[zero]=0;
                    nums[i]=temp;
                    zero++;
                }
                

            }
    }
    
    public void swap(int x1,int x2)
    {
        int temp = x2;
        x2=x1;
        x1=temp;
    }
    
    
}