class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch=word.toCharArray();
        int c=0,n=word.length();
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(ch[i]))
            {
               c=c+1;
            }
          
        }
        if(c==n||c==0)
        {
            return true;
        }
         else if(Character.isUpperCase(ch[0])&&c==1)
            {
                return true;
            }
        else
        {
            return false;
        }
    }
}