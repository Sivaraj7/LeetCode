class Solution {
    public int climbStairs(int n) {
        int F=0;
        int S=1;
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=F+S;
            F=S;
            S=res;
        }
        return res;
        
    }
}