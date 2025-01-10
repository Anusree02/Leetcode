import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true; // Duplicate found within the window
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]); // Remove the oldest element to maintain window size
            }
        }
        return false; // No duplicates found within any window
    }
}
