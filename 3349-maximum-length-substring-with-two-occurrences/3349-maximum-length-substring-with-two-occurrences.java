class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int r=0;
        int hash[]=new int[256];
        int len=0;
        int maxlen=0;
        while(r<s.length())
        {
            hash[s.charAt(r)-'a']++;
            while( hash[s.charAt(r)-'a']>2)
            {
                hash[s.charAt(l)-'a']--;
                l++;
            }
            len=r-l+1;
            maxlen=Math.max(maxlen,len);
            r++;
        }
        return maxlen;
    }
}