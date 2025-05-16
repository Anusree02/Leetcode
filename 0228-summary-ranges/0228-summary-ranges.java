class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if (nums.length == 0) return list;

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            int j=0;
            for (j=i; j + 1 < nums.length; j++)
            {
                if (nums[j + 1] == nums[j] + 1)
                {
                    continue;
                } else 
                {
                    break; 
                }
            }

            int end = nums[j];

            if (start == end) {
                list.add(String.valueOf(start));
            } else {
                list.add(start + "->" + end);
            }

            i = j;
        }

        return list;
    }
}