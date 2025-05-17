class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int maxsum=0;
        for(int i=0;i<=k-1;i++)
        {
            lsum=lsum+cardPoints[i];
        }
    maxsum=Math.max(maxsum,lsum);
    int rsum=0;
    int r=cardPoints.length-1;
    for(int i=k-1;i>=0;i--)
    {
        lsum=lsum-cardPoints[i];
        rsum=rsum+cardPoints[r];
        r--;
        maxsum=Math.max(maxsum,lsum+rsum);
    }
    return maxsum;
        
    }
}