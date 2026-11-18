class Solution {
    public int fib(int n) {
        int a=0;
        int c=0,b=1;
        if(n>1){
        for(int i=1;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;

        }}
        if(n==1)
        return 1;
        return c;
    }
}