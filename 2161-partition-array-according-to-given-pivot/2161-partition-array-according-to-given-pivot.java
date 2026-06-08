class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
          int n=nums.length;
          ArrayList<Integer>less=new ArrayList<>();
           ArrayList<Integer>equal=new ArrayList<>();
            ArrayList<Integer>great=new ArrayList<>();
          for(int i=0;i<n;i++)
          {
            if(pivot>nums[i])
            {
              less.add(nums[i]);
            }
            else if(pivot==nums[i])
            {
                equal.add(nums[i]);
            }
            else
            {
                great.add(nums[i]);
            }
          }
            less.addAll(equal);
            less.addAll(great);
          
           int[]ans=new int[n];
           for(int i=0;i<n;i++)
           {
            ans[i]=less.get(i);
           }
          return ans;
    }
}