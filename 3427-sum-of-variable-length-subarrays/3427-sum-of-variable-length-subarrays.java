class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        { 
            int start = Math.max(0, i - nums[i]);

            for (int j = start; j <= i; j++) {
                ans += nums[j];
            }
        }

        return ans;
    }
}