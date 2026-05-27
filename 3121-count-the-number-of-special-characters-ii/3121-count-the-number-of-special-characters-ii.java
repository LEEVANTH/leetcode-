class Solution {
    public int numberOfSpecialChars(String word) {
        int []lower=new int[26];
        int []upper=new int[26];
        for(int i=0;i<26;i++)
        Arrays.fill(lower,-1);
        Arrays.fill(upper,-1);
        for(int i=0;i<word.length();i++){
        char ch = word.charAt(i);
     
            if(Character.isLowerCase(ch))
            {
                lower[ch-'a']=i;
            }
            else
            {
                 int id=ch-'A';
                 if(upper[id]==-1)
                 {
                    upper[id]=i;
                 }
            }
        }
           int c=0;
        for(int i = 0; i < 26; i++) {

            if(lower[i] != -1 &&
               upper[i] != -1 &&
               lower[i] < upper[i]) {

                c++;
            }
        }

        return c;
    }
}