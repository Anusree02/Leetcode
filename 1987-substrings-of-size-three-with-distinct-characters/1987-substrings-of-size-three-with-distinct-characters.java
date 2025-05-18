class Solution {
    public int countGoodSubstrings(String s) {
        int l=0;
        int r=0;
        int count=0;
        while(r<s.length())
        {
            if((r-l+1)==3)
            {
                String sub=s.substring(l,r+1);
                if(sub.charAt(0)!=sub.charAt(1) && sub.charAt(0)!=sub.charAt(2) && sub.charAt(1)!=sub.charAt(2))
                count++;
                l++;
            }
            r++;
        }
        return count;
    }
}