class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int max=0;
        int product=1;
        for(int i=0;i<nums.length;i++)
        {
            product=1;
            for(int j=i;j<nums.length;j++)
            {
                product=product*nums[j];
                max=Math.max(max,product);
               
            }
            
        }
        return max;
    }
}