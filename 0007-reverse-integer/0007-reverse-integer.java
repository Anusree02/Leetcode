class Solution {
    public int reverse(int x) {
        int result=0;
        int n=x;
        x=Math.abs(x);
        while(x!=0)
        {
            int r=x%10;
             if (result > (Integer.MAX_VALUE - r) / 10) {
                return 0;}
            result=result*10+r;
            x=x/10;
        }
        
        return (n<0) ? (-result) : result;
    }
}