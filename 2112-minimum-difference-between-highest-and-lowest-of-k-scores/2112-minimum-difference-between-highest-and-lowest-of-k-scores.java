class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        Arrays.sort(nums);
        int l=0;
        int r=k-1;
        int sub=0;
        int minsub=Integer.MAX_VALUE;
        while(r<nums.length)
        {
            sub=nums[r]-nums[l];
            minsub=Math.min(sub,minsub);
            l++;
            r++;
        }
        return minsub;
    }
}