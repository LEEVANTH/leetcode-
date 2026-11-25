class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
            
            
        }
        //return nums;
    }
}