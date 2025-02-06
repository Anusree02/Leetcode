class Solution {
    public int missingNumber(int[] nums) {
        int N=nums.length;
         int hash[] = new int[N + 1]; //hash array

        // storing the frequencies:
        for (int i = 0; i < N ; i++)
            hash[nums[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 0; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}