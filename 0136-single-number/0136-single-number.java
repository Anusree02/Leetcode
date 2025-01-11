class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++)
        { int count=0;
            for(int j=0;j<nums.length;j++)
            {
            if(nums[i]==nums[j]&&i!=j)
            count++;
            
            }
            if(count==0)
            {
            result=nums[i];
            break;
            }
        }
        return result;
    }
}