class Solution {
    public boolean checkString(String s) {
        //char []ch=s.toCharArray();
        boolean ans=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                for(int j=i;j<s.length();j++)
                {
                    if(s.charAt(j)=='a')
                    {
                        ans= false;
                    }
                }
            }
        }
        return ans;
        }
}