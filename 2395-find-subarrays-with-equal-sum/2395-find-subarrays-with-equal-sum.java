class Solution {
    public boolean findSubarrays(int[] nums) {
        int n=nums.length;
        int s1=0,s2=0;
        boolean flag=false;
        for(int i=0;i<n-1;i++)
    {
        s1=nums[i]+nums[i+1];
        for(int j=i+1;j<n-1;j++)
        {
            s2=nums[j]+nums[j+1];
            if(s1==s2)
              flag=true;

        }
    }
    return flag;
    }
}