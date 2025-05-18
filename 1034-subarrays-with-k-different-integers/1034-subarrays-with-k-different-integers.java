class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public int atMost(int[]nums, int k)
    {
        Map<Integer,Integer> mpp=new HashMap<>();
        int l=0;
        int r=0;
        int count=0;
        while(r<nums.length)
        {
            mpp.put(nums[r],mpp.getOrDefault(nums[r], 0) + 1);
            while(mpp.size()>k)
            {
                int cnt = mpp.getOrDefault(nums[l], 0);
                if (cnt > 1)
                mpp.put(nums[l], cnt - 1);
                else
                mpp.remove(nums[l]);
                l++;
            }
            count=count+(r-l+1);
            r++;
            
        }
        return count;
    }
}