class Solution {
    public boolean detectCapitalUse(String word) {
        boolean ans=false;
        char ch[]=word.toCharArray();
        int n=ch.length;
        int c=0,v=0,m=0;
        for(int i=0;i<n;i++)
        {
            if(Character.isLowerCase(ch[i])){
                c=c+1;
            }

        }
         for(int i=0;i<n;i++)
        {
            if(Character.isUpperCase(ch[i])){
                v=v+1;
            }
            
        }
         for(int i=1;i<n;i++)
        {
            if(Character.isUpperCase(ch[0])&&Character.isLowerCase(ch[i]))
                 m=m+1;
        }
        

         if(c==n||v==n||m==n-1)
          ans=true;

          return ans;
    }
}