class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int n1=nums2.length;
        int ans;
        int []res=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n1;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    ans=nums2[j];
                    res[i]=-1;
                    for(int k=j+1;k<n1;k++){ 
                             if(ans<nums2[k]){
                             res[i]=nums2[k];
                               break;}
                             
                           }
                    }
                }
            }



                
            
        return res;
    }
}