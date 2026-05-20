class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int n1=B.length;
        
        int []C=new int[n];
        for(int i=0;i<n;i++)
        {int c=0;
            for(int j=0;j<=i;j++)
            {
                for(int k=0;k<=i;k++)
                {
                    if(A[j]==B[k])
                    {
                        c=c+1;
                        
                    }
                }
            }
            C[i]=c;
        }
      
  return C;
    }
}