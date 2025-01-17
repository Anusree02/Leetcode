class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
    int sum=0;
    for(int i=0;i<n;i++)
    {
    sum=sum^derived[i];
    }
        if(sum==0)
        return true;
        else
        return false;
    }
}