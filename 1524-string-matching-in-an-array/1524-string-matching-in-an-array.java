class Solution {
    public List<String> stringMatching(String[] words) {
      
        Set<String> li = new HashSet<>();

        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[i]!=words[j] && words[i].contains(words[j]))
                {
                    li.add(words[j]);
                    
                }
            }
           
        }
        List<String> aList = new ArrayList<>();
         aList.addAll(li);
        return aList;
    }
}