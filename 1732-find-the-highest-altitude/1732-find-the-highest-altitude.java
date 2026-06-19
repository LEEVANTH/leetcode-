class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
       int res=Integer.MIN_VALUE;
       int ans=0,che=0;
        for(int i=0;i<n;i++)
        {
            che=che+gain[i];
          res=Math.max(res,che);
        }
        if(res<0)
         res=0;
        return res;
    }
}