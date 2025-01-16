class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int firstOccurrence = -1; 
        int lastOccurrence = -1; 
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        
        if (firstOccurrence == -1) {
            ans[0] = -1;
            ans[1] = -1;
        } else {
            ans[0] = firstOccurrence;
            ans[1] = lastOccurrence;  
        }
        
        return ans;
    }
}
