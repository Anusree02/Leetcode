class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        int peak = start;
        int index = binarySearch(mountainArr, 0, peak, target, true);
        if (index != -1) return index;
        return binarySearch(mountainArr, peak + 1, n - 1, target, false);
    }

    private int binarySearch(MountainArray arr, int start, int end, int target, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            if (asc) {
                if (val < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if (val < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
