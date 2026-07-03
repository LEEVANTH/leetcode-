class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++)
       {  sum=0;
         for(int j=i;j<k+i;j++)
         {
              sum=sum+nums[j];
         }
         max=Math.max(max,sum);
       }
       double avg=(double)max/k;
       return avg;
    }
}