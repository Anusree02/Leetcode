class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j)
                {
                int res=Math.abs(nums[i]-nums[j]);
                if(res==k)
                count++;
                }
            }
        }
        return count;
    }
}