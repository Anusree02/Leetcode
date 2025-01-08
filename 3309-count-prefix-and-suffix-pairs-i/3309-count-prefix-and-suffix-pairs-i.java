class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                
                    if(isPrefixAndSuffix(words[i],words[j]))
                    count++;
            }

        }
        return count;
        
    }
    public boolean isPrefixAndSuffix(String one, String two)
    {
        if(two.startsWith(one) && two.endsWith(one))
        return true;
        else
        return false;
    }
}