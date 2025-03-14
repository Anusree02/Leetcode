class Solution {
    public int mySqrt(long x) {
        long l = 1;
        long r = x + 1;
        while (l < r) {
            long m = l + (r - l) / 2;
            if (m > x / m)
            r = m;
            else
            l = m + 1;
        }
    return (int)l - 1;
    }
}