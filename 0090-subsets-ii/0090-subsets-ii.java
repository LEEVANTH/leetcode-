class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        int total=1<<n;
        for(int i=0;i<total;i++)
        {
            List<Integer> subnet=new ArrayList<>();

            for(int j=0;j<n;j++)
        {
            if((i&(1<<j))!=0)
            {
                subnet.add(nums[j]);
            }
        }
        res.add(subnet);
        }
        return new ArrayList<>(res);
    }
}