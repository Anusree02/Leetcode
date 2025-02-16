class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); 
        int left = 0, right;
        long total = 0; 
        int maxFreq = 1;

        for (right = 0; right < nums.length; right++) {
            total += nums[right]; 
            while ((long)(right - left + 1) * nums[right] - total > k) {
                total -= nums[left]; 
                left++; 
            }

            maxFreq = Math.max(maxFreq, right - left + 1); 
        }
        return maxFreq;
    }
}