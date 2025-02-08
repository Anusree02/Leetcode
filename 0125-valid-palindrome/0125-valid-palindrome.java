class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("\\s", "");
         s = s.replaceAll("[^a-zA-Z0-9]", "");  
         s=s.toLowerCase();
        String result="";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            result+=s.charAt(i);
        }
        if(s.equals(result))
        return true;
        else
        return false;
    }
}