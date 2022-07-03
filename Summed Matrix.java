class Solution {
    static long sumMatrix(long n, long q) {
        // code 
        long ans=0;
        if(n>=q)
        {
            ans=(q-1);
        }
        else
        {
            ans=(n*2)-(q-1);
        }
        if(ans<0)
        {
            ans=0;
        }
        return ans;
        
    }
};
