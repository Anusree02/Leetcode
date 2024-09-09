class Solution {
    public int majorityElement(int[] nums) {
         int n = nums.length;
        int mcnt=0;
        int el = 0; 
        for(int j=0;j<n;j++){
        int cnt=0;

        for (int i = j; i < n; i++) {
            if (nums[j]==nums[i])
            cnt++;
            
        }
        
        if(cnt>=mcnt){
        el=nums[j];
        mcnt=cnt;
        }
    }
        return el;
    }
}