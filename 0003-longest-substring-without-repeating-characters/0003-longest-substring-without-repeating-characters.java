class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;
        int maxlen=1;
        for(int i=0;i<s.length();i++)
        {
            int len=0;
            int []hash=new int[256];
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(hash[ch]==1)
                break;
                else
                {
                    len=j-i+1;
                    maxlen=Math.max(maxlen,len);
                    hash[ch]=1;
                }
            }
            
        }
        return maxlen;
    }
}