class Solution {
    public int maxProduct(int n) {
        int size=String.valueOf(n).length();
        int []arr=new int[size];
        int rem,ans;
        for(int i=0;i<size;i++)
        {
            rem=n%10;
            arr[i]=rem;
            n=n/10;

        }
        Arrays.sort(arr);
        
            ans=arr[size-1]*arr[size-2];
        
        return ans;
        
    }
}