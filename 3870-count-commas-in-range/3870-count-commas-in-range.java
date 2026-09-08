class Solution {
    public int countCommas(int n) {
        int ans;
        int div=0;
        if(n<=999){
         ans=0;
        }
        else{
         div=n/1000;
         if(div>1)
        ans=((1000*div)-1000)+(n%1000 + 1);
         else
          ans=n%1000+1;
        }
        return ans;
    }
}