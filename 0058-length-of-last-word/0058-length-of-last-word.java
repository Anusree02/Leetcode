class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            m=i;
        }
        if(m==0)
        return s.length();
        String sub=s.substring(m+1);
        return sub.length();
    }
}