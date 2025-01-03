class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        long sum=0;
        long rsum=0;
        for(int j=0;j<nums.length;j++){
            sum=sum+(nums[j]);
        }
        for(int i=0;i<nums.length-1;i++){
            rsum=rsum+nums[i];
            if(rsum>=(sum-rsum)){
                if(i>=0 && i<(nums.length-1))
                {
                count++;
                }
            }
        }
        return count;
    }
}