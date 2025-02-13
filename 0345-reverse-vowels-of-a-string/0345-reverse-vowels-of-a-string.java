class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('a');arr.add('e');arr.add('i');arr.add('o');arr.add('u');
        arr.add('A');arr.add('E');arr.add('I');arr.add('O');arr.add('U');

        char[] str = s.toCharArray();

        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(arr.contains(str[l])&&arr.contains(str[r]))
            {
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;

                l++;
                r--;
            }
            else if(!arr.contains(str[r]))
            r--;
            else if(!arr.contains(str[l]))
            l++;
        }
        return new String(str);
        
    }
}