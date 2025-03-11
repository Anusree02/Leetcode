class Solution {
    public boolean search(int[] nums, int target) {
        boolean res=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            res=true;
        }
        return res;
    }
}