class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer> rest=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]&& !rest.contains(nums1[i]))
                {
                    rest.add(nums2[j]);
                }
            }
        }
            int[] result = new int[rest.size()];
            for (int i = 0; i < rest.size(); i++) {
            result[i] = rest.get(i);
        }
        return result;
    }
}