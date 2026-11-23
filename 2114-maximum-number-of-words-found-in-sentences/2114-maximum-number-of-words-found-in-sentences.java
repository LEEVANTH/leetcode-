class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int c,ans=0;
        for(int i=0;i<sentences.length;i++)
        {
            c=1;
            for(int j=0;j<sentences[i].length();j++){
            if(sentences[i].charAt(j)==' ')
            {
                c=c+1;
            }
            ans=Math.max(ans,c);
        }
        }
return ans;
    }
}