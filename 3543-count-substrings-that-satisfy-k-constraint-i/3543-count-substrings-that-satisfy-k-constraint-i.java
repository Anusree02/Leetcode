class Solution {
    
    public int countKConstraintSubstrings(String s, int k) {
        char[] arr = s.toCharArray();

        int atMostZeros = atMostK(arr, k, '0');
        int atMostOnes = atMostK(arr, k, '1');
        int both = atMostKBoth(arr, k);

        return atMostZeros + atMostOnes - both;
    }
    private int atMostK(char[] s, int k, char ch) {
        int count = 0;
        int l = 0;
        int freq = 0;
        for (int r = 0; r < s.length; r++) {
            if (s[r] == ch) freq++;

            while (freq > k) {
                if (s[l] == ch) freq--;
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
    private int atMostKBoth(char[] s, int k) {
        int count = 0;
        int l = 0;
        int zeroCount = 0;
        int oneCount = 0;

        for (int r = 0; r < s.length; r++) {
            if (s[r] == '0') zeroCount++;
            else oneCount++;

            while (zeroCount > k || oneCount > k) {
                if (s[l] == '0') zeroCount--;
                else oneCount--;
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}
