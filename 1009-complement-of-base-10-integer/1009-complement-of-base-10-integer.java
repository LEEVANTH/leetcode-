class Solution {
    public int bitwiseComplement(int n) {
        String bin=Integer.toBinaryString(n);
        String res="";
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='0')
            {
                res=res+"1";
            }
            else
             res=res+"0";
        }
        int dec=Integer.parseInt(res,2);
        return dec;
    }
}